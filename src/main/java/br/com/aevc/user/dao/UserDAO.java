package br.com.aevc.user.dao;

import javax.persistence.LockTimeoutException;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceException;
import javax.persistence.PessimisticLockException;
import javax.persistence.QueryTimeoutException;
import javax.persistence.TransactionRequiredException;

import br.com.aevc.user.domain.entity.User;

public interface UserDAO {

	User findBy(String login)
			throws NoResultException, NonUniqueResultException, IllegalStateException, QueryTimeoutException,
			TransactionRequiredException, PessimisticLockException, LockTimeoutException, PersistenceException;

}
