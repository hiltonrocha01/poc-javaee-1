package br.com.aevc.login.dao.db;

import java.util.Map;

import br.com.aevc.login.domain.entity.User;

public class MyDatabaseConnection {

	private final Map<String, User> users = Map.ofEntries(Map.entry("albert", new User("albert", "123456")));

	public Map<String, User> getUsers() {
		return users;
	}

}
