package br.com.aevc.login.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ProfileDAOImpl implements ProfileDAO {

	@PersistenceContext(name = "poc-javaee")
	private EntityManager entityManager;

	@Override
	public List<String> findAllProfileNames() {
		return this.entityManager
				.createQuery("SELECT profile.name FROM Profile profile WHERE profile.active = true", String.class)
				.getResultList();
	}

}
