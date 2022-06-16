package com.xworkz.login.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.login.Entity.UserEntity;
import com.xworkz.login.dao.RegistrationDao;
import com.xworkz.login.dto.RegistractionDto;

@Service
public class RegistrationService {
	private final Logger logger = LogManager.getLogger(RegistrationService.class);
	@Autowired

	private RegistrationDao dao;

	public void savedata(RegistractionDto dto) {
		logger.info("INFO -save data registration service method invoked");
		UserEntity entity = new UserEntity();
		BeanUtils.copyProperties(dto, entity);
		{
			logger.info("INFo-login method invoked");
			dao.saveData(entity);
		}
	}

}
