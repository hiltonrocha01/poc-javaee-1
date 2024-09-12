package br.com.aevc.user.service;

import javax.inject.Inject;

import br.com.aevc.user.dao.UserDAO;
import br.com.aevc.user.domain.entity.User;

public class UserServiceImpl implements UserService{

	@Inject
	private UserDAO userDAO;
	
	@Override
	public User get(String login) {
		return this.userDAO.findBy(login);
	}

}
