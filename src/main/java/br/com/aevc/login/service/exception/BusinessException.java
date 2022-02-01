package br.com.aevc.login.service.exception;

public class BusinessException extends Exception {

	private static final long serialVersionUID = -997300985336821332L;

	public BusinessException(String message) {
		super(message);
	}

	public BusinessException(String message, Throwable cause) {
		super(message, cause);
	}

}
