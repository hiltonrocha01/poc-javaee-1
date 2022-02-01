package br.com.aevc.login.service;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;

import br.com.aevc.login.dao.ProfileDAO;
import br.com.aevc.login.service.exception.BusinessException;
import br.com.aevc.login.service.exception.SystemException;

public class ProfileServiceImpl implements ProfileService {

	@Inject
	private ProfileDAO profileDAO;

	@Override
	public List<String> getAllProfileNames() throws SystemException, BusinessException {
		try {
			return this.profileDAO.findAllProfileNames();
		} catch (NoResultException e) {
			throw new SystemException("Usuário não encontrado.", e);
		} catch (PersistenceException e) {
			throw new SystemException(e.getMessage(), e);
		} catch (Exception e) {
			throw new BusinessException(e.getMessage(), e);
		}
	}
	
}
