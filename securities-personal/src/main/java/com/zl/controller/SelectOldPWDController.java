package com.zl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netflix.client.http.HttpRequest;
import com.zl.pojo.User;
import com.zl.service.SelectOldPWDService;

@Controller
public class SelectOldPWDController {
	@Autowired
	private SelectOldPWDService selectOldPWDService;
	
	@RequestMapping("")
	public String selectOldPwd(String username,HttpRequest request) {
		User user=selectOldPWDService.selectOldPwd(username);
		return "updatePWD.html";
	}

}
