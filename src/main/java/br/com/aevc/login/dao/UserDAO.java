package br.com.aevc.login.dao;

import javax.persistence.LockTimeoutException;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceException;
import javax.persistence.PessimisticLockException;
import javax.persistence.QueryTimeoutException;
import javax.persistence.TransactionRequiredException;

import br.com.aevc.login.domain.entity.User;

public interface UserDAO {

	User findByLogin(String login)
			throws NoResultException, NonUniqueResultException, IllegalStateException, QueryTimeoutException,
			TransactionRequiredException, PessimisticLockException, LockTimeoutException, PersistenceException;

}
