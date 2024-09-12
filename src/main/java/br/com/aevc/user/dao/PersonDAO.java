package br.com.aevc.user.dao;

import java.util.List;

import br.com.aevc.user.domain.PersonListingDTO;
import br.com.aevc.user.domain.entity.Person;

public interface PersonDAO {

	List<PersonListingDTO> findAll();

	void insert(Person person);

}
