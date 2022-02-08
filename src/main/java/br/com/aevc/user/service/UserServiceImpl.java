package br.com.aevc.user.service;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import br.com.aevc.user.dao.UserDAO;
import br.com.aevc.user.domain.entity.User;

public class UserServiceImpl implements UserService{

	@Inject
	private UserDAO userDAO;
	
	@Override
	@Transactional
	public User get(String login) {
		return this.userDAO.findBy(login);
	}

}
