package br.com.aevc.login.dao;

import br.com.aevc.login.domain.entity.User;

public interface UserDAO {

	User findByLogin(String userName);

}
