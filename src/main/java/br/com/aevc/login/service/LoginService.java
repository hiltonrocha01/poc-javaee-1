package br.com.aevc.login.service;

import java.util.NoSuchElementException;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.aevc.login.dao.UserDAO;
import br.com.aevc.login.domain.entity.User;

@ApplicationScoped
public class LoginService {

	@Inject
	private UserDAO userDAO;

	public User login(String userName, String password) {
		try {
			return this.userDAO.login(userName, password);
		} catch (NoSuchElementException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}
}
