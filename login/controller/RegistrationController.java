package com.xworkz.login.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.login.controller.LoginController;
import com.xworkz.login.dao.RegistrationDao;
import com.xworkz.login.dto.RegistractionDto;
@Controller
public class RegistrationController {
	private final Logger logger = (Logger) LogManager.getLogger(LoginController.class);
private  RegistrationDao dao ;
	
	// TODO Auto-generated constructor stub
//}
	@GetMapping("displayRegistration.do")
	
	public ModelAndView validateUser() {
		logger.info("INFO - login method invoked....");
		try {
			throw new Exception("some exception");
		} catch (Exception e) {
			// e.printStcktrace();
			logger.error(e.getMessage(), e);
		}
		return new ModelAndView("sign");

	}
	
}
