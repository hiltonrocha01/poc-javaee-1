package br.com.aevc.user.service;

import br.com.aevc.user.domain.entity.User;

public interface UserService {

	User get(String login);

}
