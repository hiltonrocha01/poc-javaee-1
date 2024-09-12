package br.com.aevc.login.service;

import java.io.Serializable;

import br.com.aevc.login.service.exception.BusinessException;
import br.com.aevc.login.service.exception.SystemException;
import br.com.aevc.user.domain.entity.User;

public interface LoginService extends Serializable {

	User login(String login, String password) throws SystemException, BusinessException;

}
