package com.hpp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class UserServiceImpl implements UserService{

	@HystrixCommand(fallbackMethod = "fallbackHi")
	@Override
	public List<String> getUserList() {
		List<String> list = new ArrayList<String>();
		list.add("hpp");
		list.add("djj");
		list.add("xlg");
		list.add("szl");
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
