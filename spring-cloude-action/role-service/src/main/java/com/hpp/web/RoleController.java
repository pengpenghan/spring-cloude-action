package com.hpp.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping(value = "/role")
public class RoleController {
	
	@HystrixCommand(fallbackMethod = "fallbackHi")
	@RequestMapping(value = "/rolelist")
	public List<String> getRoleList(){
		List<String> list = new ArrayList<String>();
		list.add("系统管理员");
		list.add("会员");
		list.add("游客");
		return list;
	}
	
	public List<String> fallbackHi(){
		List<String> list = new ArrayList<String>();
		list.add("exception");
		list.add("exception");
		list.add("exception");
		list.add("exception");
		return list;
	}

}
