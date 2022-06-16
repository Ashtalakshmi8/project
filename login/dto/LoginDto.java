package com.xworkz.login.dto;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import lombok.Data;

@Data
public class LoginDto {
	private  final Logger logger=LogManager.getLogger(LoginDto.class);
	private String userName;
	private String password;
	

}
