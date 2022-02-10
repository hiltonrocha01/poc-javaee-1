package br.com.aevc.user.mb.converters;

import static java.util.Optional.ofNullable;

import java.time.LocalDate;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "localDateConverter")
public class LocalDateConverter implements Converter<LocalDate> {

	@Override
	public LocalDate getAsObject(FacesContext context, UIComponent component, String value) {
		String[] split = value.split("/");
		return LocalDate.parse(String.format("%s-%s-%s", split[2], split[1], split[0]));
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, LocalDate value) {
		return ofNullable(value).map(Object::toString).orElse(null);
	}

}
