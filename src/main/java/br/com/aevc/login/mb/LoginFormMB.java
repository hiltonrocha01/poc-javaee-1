package br.com.aevc.login.mb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * @author alber
 *
 */
@Named
@RequestScoped
public class LoginFormMB {

	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
