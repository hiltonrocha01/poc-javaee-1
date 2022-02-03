package br.com.aevc.user.dao;

import java.util.List;

import br.com.aevc.user.domain.PersonListingDTO;

public interface PersonDAO {

	List<PersonListingDTO> findAll();

}
