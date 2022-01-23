package br.com.aevc.login.service;

import java.io.Serializable;

import br.com.aevc.login.domain.entity.User;

public interface LoginService extends Serializable {

	User login(String userName, String password);

}
