package br.com.aevc.login.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.aevc.login.service.ProfileService;
import br.com.aevc.login.service.exception.BusinessException;
import br.com.aevc.login.service.exception.SystemException;

/**
 * @author alber
 *
 */
@Named
@RequestScoped
public class LoginFormMB {

	private String login;
	private String password;
	private String profile;

	private List<String> profiles;
	@Inject
	private ProfileService profileService;

	@PostConstruct
	public void init() {
		try {
			this.profiles = this.profileService.getAllProfileNames();
		} catch (SystemException e) {
			this.profiles = List.of();
		} catch (BusinessException e) {
			this.profiles = List.of();
		}
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public List<String> getProfiles() {
		return profiles;
	}

	public void setProfiles(List<String> profiles) {
		this.profiles = profiles;
	}

}
