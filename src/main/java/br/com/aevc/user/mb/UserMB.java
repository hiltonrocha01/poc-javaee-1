package br.com.aevc.user.mb;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.aevc.user.domain.PersonListingDTO;
import br.com.aevc.user.service.PersonService;

@Named
@RequestScoped
public class UserMB {

	@Inject
	private PersonService personService;

	public List<PersonListingDTO> getUsers() {
		return this.personService.getAll();
	}

}
