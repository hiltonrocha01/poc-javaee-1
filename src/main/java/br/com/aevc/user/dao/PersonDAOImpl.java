package br.com.aevc.user.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import br.com.aevc.user.domain.PersonListingDTO;
import br.com.aevc.user.domain.entity.Person;

public class PersonDAOImpl implements PersonDAO {

	@PersistenceContext(name = "poc-javaee")
	private EntityManager entityManager;

	@Override
	public List<PersonListingDTO> findAll() {
		// JPQL
		// CONSTRUCTOR RESULT
		return this.entityManager.createQuery(
				" SELECT new br.com.aevc.user.domain.PersonListingDTO(person.fullName, person.document, person.birthDate) FROM Person person ",
				PersonListingDTO.class).getResultList();
	}

	@Override
	@Transactional
	public void insert(Person person) {
		this.entityManager.persist(person);
	}

}
