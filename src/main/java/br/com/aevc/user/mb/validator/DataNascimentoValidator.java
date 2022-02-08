package br.com.aevc.user.mb.validator;

import java.time.LocalDate;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "dataNascimentoValidator")
public class DataNascimentoValidator implements Validator<LocalDate> {

	@Override
	public void validate(FacesContext context, UIComponent component, LocalDate value) throws ValidatorException {
//		LocalDate parse = LocalDate.parse(value);
		if(!value.isBefore(LocalDate.parse("2010-01-01"))) {
			throw new ValidatorException(new FacesMessage("Idade inválida!"));
		}
	}

}
