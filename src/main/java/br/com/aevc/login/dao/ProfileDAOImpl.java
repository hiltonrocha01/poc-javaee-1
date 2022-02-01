package br.com.aevc.login.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public class ProfileDAOImpl implements ProfileDAO {

	@Inject
	private EntityManager entityManager;

	@Override
	public List<String> findAllProfileNames() {
		return this.entityManager
				.createQuery("SELECT profile.name FROM Profile profile WHERE profile.active = true", String.class)
				.getResultList();
	}

}
