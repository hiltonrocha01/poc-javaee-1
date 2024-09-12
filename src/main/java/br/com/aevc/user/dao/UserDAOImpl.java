package br.com.aevc.user.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.aevc.user.domain.entity.User;

public class UserDAOImpl implements UserDAO {

	@PersistenceContext(name = "poc-javaee")
	private EntityManager entityManager;

	@Override
	public User findBy(String login) {
		return this.entityManager.createQuery("SELECT user FROM User user WHERE user.login = :login", User.class)
				.setParameter("login", login).getSingleResult();
	}

	public List<User> findAll() {
		//JPQL
		return this.entityManager.createQuery("SELECT user FROM User user", User.class).getResultList();
	}

}
