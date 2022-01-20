package br.com.aevc.login.dao;

import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.aevc.login.dao.db.MyDatabaseConnection;
import br.com.aevc.login.domain.entity.User;

@ApplicationScoped
public class UserDAO {

//	private static final Map<String, User> USERS = Map.ofEntries(Map.entry("albert", new User("albert", "123456")));
	
	@Inject
	private MyDatabaseConnection myDatabaseConnection;

	public User login(String userName, String password) {
		return Optional.ofNullable(this.myDatabaseConnection.getUsers().get(userName)).orElseThrow();
	}
}
