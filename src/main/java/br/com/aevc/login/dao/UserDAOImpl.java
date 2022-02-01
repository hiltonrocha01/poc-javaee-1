package br.com.aevc.login.dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.aevc.login.domain.entity.User;

public class UserDAOImpl implements UserDAO {

	@Inject
	private EntityManager entityManager;

	@Override
	public User findByLogin(String login) {
		return this.entityManager.createQuery("SELECT user FROM User user WHERE user.login = :login", User.class)
				.setParameter("login", login).getSingleResult();
	}

}
