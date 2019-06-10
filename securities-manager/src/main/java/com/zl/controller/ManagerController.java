package com.zl.controller;


import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.pojo.User;
import com.zl.service.ILoginService;

import com.zl.util.Viewjson;

@Controller
public class ManagerController {

	
	  @Inject
	  @Named("loginService")
	  private ILoginService loginService;

	@RequestMapping(path = "/login")
	@ResponseBody
	public Viewjson login(String username, String password, HttpServletRequest request) {
		Viewjson viewjson = new Viewjson();

		boolean bl = loginService.login(username, password, request.getRemoteAddr(), User.USERTYPE_MARAGER);

		  if (bl==false) { 
			  viewjson.setSuccess(false);
			  viewjson.setMsg("用户名或密码错误"); 
		  }	 
		return viewjson;
	}
	
	
}
