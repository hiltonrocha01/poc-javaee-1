package br.com.aevc.login.service;

import java.util.NoSuchElementException;

import javax.inject.Inject;

import br.com.aevc.login.dao.UserDAO;
import br.com.aevc.login.domain.entity.User;

public class LoginServiceImpl implements LoginService {

	private static final long serialVersionUID = -5736213823999199217L;

	@Inject
	private UserDAO userDAO;

	@Override
	public User login(String login, String password) {
		try {
			return this.userDAO.findByLogin(login);
		} catch (NoSuchElementException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}
}
