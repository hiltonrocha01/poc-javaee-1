package br.com.aevc.util;

import javax.faces.context.FacesContext;

public class RequestParameterUtil {

	public static String getParameter(String paramenter) {
		return FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get(paramenter);
	}
}
