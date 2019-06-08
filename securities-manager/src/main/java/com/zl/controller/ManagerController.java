package com.zl.controller;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.pojo.User;
import com.zl.service.impl.LoginServiceImpl;
import com.zl.util.Viewjson;

@Controller
public class ManagerController {

	@Inject
	@Named("loginService")
	private LoginServiceImpl loginservice;

	@RequestMapping(path = "/login")
	@ResponseBody
	public Viewjson login(String username, String password, HttpServletRequest request) {
		System.out.println(username);
		System.out.println(request.getRemoteAddr());
		Viewjson viewjson = new Viewjson();
		/*
		 * viewjson.setSuccess(false); viewjson.setMsg("用户名或密码错误");
		 */
		boolean bl = loginservice.login(username, password, request.getRemoteAddr(), User.USERTYPE_MARAGER);
		
		  System.out.println(">>>>>>"+bl);
		  if (bl==false) { 
			  viewjson.setSuccess(false);
			  viewjson.setMsg("用户名或密码错误"); 
		  }
		 
		return viewjson;
	}
}
