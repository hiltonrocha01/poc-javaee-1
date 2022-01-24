package br.com.aevc.login.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.aevc.login.domain.ProfileEnum;

/**
 * @author alber
 *
 */
@Named
@RequestScoped
public class LoginFormMB {

	private String login;
	private String password;
	private ProfileEnum profile;

	private List<ProfileEnum> profiles;

	@PostConstruct
	public void init() {
		this.profiles = List.of(ProfileEnum.ADMIN);
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

	public ProfileEnum getProfile() {
		return profile;
	}

	public void setProfile(ProfileEnum profile) {
		this.profile = profile;
	}

	public List<ProfileEnum> getProfiles() {
		return profiles;
	}

}
