package br.com.aevc.login.dao.factory;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import br.com.aevc.login.dao.db.MyDatabaseConnection;

@ApplicationScoped
public class MyDatabaseConnectionProducer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Produces
	public MyDatabaseConnection myDatabaseConnection() {
		return new MyDatabaseConnection();
	}

}
