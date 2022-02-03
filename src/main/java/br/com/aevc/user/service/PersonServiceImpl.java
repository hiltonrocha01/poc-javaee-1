package br.com.aevc.user.service;

import java.util.List;

import javax.inject.Inject;

import br.com.aevc.user.dao.PersonDAO;
import br.com.aevc.user.domain.PersonListingDTO;

public class PersonServiceImpl implements PersonService {

	@Inject
	private PersonDAO personDAO;

	@Override
	public List<PersonListingDTO> getAll() {
		return this.personDAO.findAll();
	}

}
