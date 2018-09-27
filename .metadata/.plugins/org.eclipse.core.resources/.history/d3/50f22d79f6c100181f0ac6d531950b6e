package com.hpp.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/role")
public class RoleController {
	
	@RequestMapping(value = "/rolelist")
	public List<String> getRoleList(){
		List<String> list = new ArrayList<String>();
		list.add("系统管理员");
		list.add("会员");
		list.add("游客");
		return list;
	}

}
