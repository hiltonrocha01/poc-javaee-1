package br.com.aevc.login.mb;

import static br.com.aevc.util.ActionEventUtil.getAttribute;
import static br.com.aevc.util.FacesMessageUtil.showGlobalMessage;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

import br.com.aevc.login.domain.LoggedUserVO;
import br.com.aevc.login.domain.MenuVO;
import br.com.aevc.login.service.LoginService;
import br.com.aevc.login.service.exception.BusinessException;
import br.com.aevc.login.service.exception.SystemException;
import br.com.aevc.user.domain.entity.User;

/**
 * @author alber
 *
 */
@Named
@SessionScoped
//M V C 
public class LoginMB implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private LoginService loginService;

	private LoggedUserVO loggedUser;
	private boolean logged;

	public void login(ActionEvent actionEvent) {
		try {
			User user = this.loginService.login(getAttribute(actionEvent, "login"),
					getAttribute(actionEvent, "password"));

			List<MenuVO> menusVO = user.getProfile().getMenus().stream()
					.map(menu -> new MenuVO(menu.getName(), menu.getUrl())).collect(Collectors.toList());

			this.loggedUser = new LoggedUserVO(user.getPerson().getFullName(), user.getProfile().getName(), menusVO);
			this.logged = true;
		} catch (SystemException e) {
			showGlobalMessage("Erro sistemico!", e.getMessage());
		} catch (BusinessException e) {
			showGlobalMessage("Erro negocial!", e.getMessage());
		}
	}

	public String logout() {
		((HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false)).invalidate();
		return "index?faces-redirect=true";
	}

	public String redirect() {
		return this.logged ? "../index?faces-redirect=true" : "login/login?faces-redirect=true";
	}

	public LoggedUserVO getLoggedUser() {
		return loggedUser;
	}

	public boolean isLogged() {
		return logged;
	}

}
