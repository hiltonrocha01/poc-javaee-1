package br.com.aevc.user.dao;

import java.util.List;

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

	public List<User> findAll() {
		//JPQL
		return this.entityManager.createQuery("SELECT user FROM User user", User.class).getResultList();
	}

}
