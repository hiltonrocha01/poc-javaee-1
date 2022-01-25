package br.com.aevc.login.mb;

import static br.com.aevc.util.ActionEventUtil.getAttribute;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

import br.com.aevc.login.domain.LoggedUserVO;
import br.com.aevc.login.domain.entity.User;
import br.com.aevc.login.service.LoginService;

/**
 * @author alber
 *
 */
@Named
@SessionScoped
public class LoginMB implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private LoginService loginService;

	private LoggedUserVO loggedUser;
	private boolean logged;

	public void login(ActionEvent actionEvent) {
		User user = this.loginService.login(getAttribute(actionEvent, "login"), getAttribute(actionEvent, "password"));
		this.loggedUser = new LoggedUserVO(user.getPerson().getFullName());
		this.logged = true;

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
