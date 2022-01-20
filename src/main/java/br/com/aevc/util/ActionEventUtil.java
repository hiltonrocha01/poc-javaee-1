package br.com.aevc.util;

import javax.faces.event.ActionEvent;

public class ActionEventUtil {

	public static String getAttribute(ActionEvent actionEvent, String attributeName) {
		return (String) actionEvent.getComponent().getAttributes().get(attributeName);
	}

}
