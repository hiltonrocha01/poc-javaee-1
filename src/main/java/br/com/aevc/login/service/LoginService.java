package br.com.aevc.login.service;

import java.io.Serializable;

import br.com.aevc.login.domain.entity.User;
import br.com.aevc.login.service.exception.BusinessException;
import br.com.aevc.login.service.exception.SystemException;

public interface LoginService extends Serializable {

	User login(String login, String password) throws SystemException, BusinessException;

}
