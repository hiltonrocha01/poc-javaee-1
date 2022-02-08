package br.com.aevc.user.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import br.com.aevc.user.domain.PersonListingDTO;
import br.com.aevc.user.domain.entity.Person;

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

	@Override
	public void insert(Person person) {
		this.entityManager.persist(person);
		//SALVAR NO BANCO
		
	}

}
