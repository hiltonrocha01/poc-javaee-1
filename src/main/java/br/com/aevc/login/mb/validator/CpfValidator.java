package br.com.aevc.login.mb.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

@FacesValidator("cpfValidator")
public class CpfValidator implements Validator<String> {

	private static final CPFValidator CPF_VALIDATOR = new CPFValidator();

	@Override
	public void validate(FacesContext context, UIComponent component, String value) throws ValidatorException {
		try {
			CPF_VALIDATOR.assertValid(value);
		} catch (InvalidStateException e) {
			throw new ValidatorException(new FacesMessage("Não é um cpf válido!"));
		}
	}

}
