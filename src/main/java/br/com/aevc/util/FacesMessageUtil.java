package br.com.aevc.util;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

public class FacesMessageUtil {

	public static void showGlobalMessage(String summary) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(summary));
	}

	public static void showGlobalMessage(String summary, String detail) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(summary, detail));
	}

	public static void showGlobalMessage(Severity severity, String summary, String detail) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, summary, detail));
	}

	public static void showClientMessage(String clientId, String summary) {
		FacesContext.getCurrentInstance().addMessage(clientId, new FacesMessage(summary));
	}

	public static void showGlobalMessage(String clientId, String summary, String detail) {
		FacesContext.getCurrentInstance().addMessage(clientId, new FacesMessage(summary, detail));
	}

	public static void showGlobalMessage(String clientId, Severity severity, String summary, String detail) {
		FacesContext.getCurrentInstance().addMessage(clientId, new FacesMessage(severity, summary, detail));
	}

}
