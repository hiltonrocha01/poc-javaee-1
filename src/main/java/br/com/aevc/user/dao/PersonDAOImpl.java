package br.com.aevc.user.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.aevc.user.domain.PersonListingDTO;

public class PersonDAOImpl implements PersonDAO {

	@Inject
	private EntityManager entityManager;

	@Override
	public List<PersonListingDTO> findAll() {
		// JPQL
		// CONSTRUCTOR RESULT
		return this.entityManager.createQuery(
				" SELECT new br.com.aevc.user.domain.PersonListingDTO(person.fullName, person.document, person.birthDate) FROM Person person ",
				PersonListingDTO.class).getResultList();
	}

}
