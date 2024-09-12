package br.com.aevc.user.service;

import java.util.List;

import br.com.aevc.user.domain.NewUserDTO;
import br.com.aevc.user.domain.PersonListingDTO;

public interface PersonService {

	List<PersonListingDTO> getAll();

	void save(NewUserDTO newUserDTO);

}
