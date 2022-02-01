package br.com.aevc.login.service.exception;

public class SystemException extends Exception {

	private static final long serialVersionUID = -997300985336821332L;

	public SystemException(String message) {
		super(message);
	}

	public SystemException(String message, Throwable cause) {
		super(message, cause);
	}

}
