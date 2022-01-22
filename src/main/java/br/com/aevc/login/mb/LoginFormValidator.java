package br.com.aevc.login.mb;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class LoginFormValidator implements Validator<String> {

	@Override
	public void validate(FacesContext context, UIComponent component, String value) throws ValidatorException {
		
	}

}
