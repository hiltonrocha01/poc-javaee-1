package br.com.aevc.login.service;

import javax.inject.Inject;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;

import br.com.aevc.login.domain.entity.User;
import br.com.aevc.login.service.exception.BusinessException;
import br.com.aevc.login.service.exception.SystemException;
import br.com.aevc.user.dao.UserDAO;

public class LoginServiceImpl implements LoginService {

	private static final long serialVersionUID = -5736213823999199217L;

	@Inject
	private UserDAO userDAO;

	@Override
	public User login(String login, String password) throws SystemException, BusinessException {
		try {
			return this.userDAO.findByLogin(login);
		} catch (NoResultException e) {
			throw new SystemException("Usuário não encontrado.", e);
		} catch (PersistenceException e) {
			throw new SystemException(e.getMessage(), e);
		} catch (Exception e) {
			throw new BusinessException(e.getMessage(), e);
		}
	}
	
}
