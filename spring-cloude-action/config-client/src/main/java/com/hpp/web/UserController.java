package com.hpp.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class UserController {
	
	@Value("${userName}")
	private String userName;
	
	@RequestMapping(value = "/user")
	public String getUserName(){
		return userName;
	}
 
}
