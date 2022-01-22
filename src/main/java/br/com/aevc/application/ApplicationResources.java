package br.com.aevc.application;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ApplicationScoped
public class ApplicationResources {

	@Produces
	@PersistenceContext(unitName = "poc-javaee-pu")
	private EntityManager em;

}
