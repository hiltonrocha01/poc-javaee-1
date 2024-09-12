package br.com.aevc.user.mb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.aevc.user.domain.NewUserDTO;
import br.com.aevc.user.service.PersonService;

@Named
@RequestScoped
public class UserFormMB {

	@Inject
	private PersonService personService;
	
	private NewUserDTO newUserDTO = new NewUserDTO();

	public String save() {
		this.personService.save(newUserDTO);
		return "/usuario/usuarios?faces-redirect=true";
	}
	
	public String update() {
		this.personService.save(newUserDTO);
		return "/usuario/usuarios?faces-redirect=true";
	}

	public NewUserDTO getNewUserDTO() {
		return newUserDTO;
	}

	public void setNewUserDTO(NewUserDTO newUserDTO) {
		this.newUserDTO = newUserDTO;
	}

}
