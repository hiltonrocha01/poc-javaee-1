package br.com.aevc.login.service;

import java.util.List;

import br.com.aevc.login.service.exception.BusinessException;
import br.com.aevc.login.service.exception.SystemException;

public interface ProfileService {

	List<String> getAllProfileNames() throws SystemException, BusinessException;

}
