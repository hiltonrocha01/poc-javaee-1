package br.com.aevc.user.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.inject.Inject;

import br.com.aevc.user.dao.PersonDAO;
import br.com.aevc.user.domain.NewUserDTO;
import br.com.aevc.user.domain.PersonListingDTO;
import br.com.aevc.user.domain.entity.Person;
import br.com.aevc.user.domain.entity.User;

public class PersonServiceImpl implements PersonService {

	@Inject
	private PersonDAO personDAO;

	@Override
	public List<PersonListingDTO> getAll() {
		return this.personDAO.findAll();
	}

	@Override
	public void save(NewUserDTO newUserDTO) {
		Person person = new Person();
		person.setFullName(newUserDTO.getFullName());
		person.setDocument(newUserDTO.getDocument());
		person.setBirthDate(LocalDate.parse(newUserDTO.getBirthDate()));
		person.setCreatedAt(LocalDateTime.now());
		
		User user = new User();
		user.setLogin(newUserDTO.getDocument());
		user.setPassword(newUserDTO.getPassword());
		
		person.setUser(user);
		
		this.personDAO.insert(person);
	}

}
