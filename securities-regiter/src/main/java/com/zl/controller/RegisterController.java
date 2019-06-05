package com.zl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.client.AccountClient;
import com.zl.dao.EmpMapper;
import com.zl.pojo.Account;

@Controller
public class RegisterController {
	@Autowired
	AccountClient accountClient;
	
	@Autowired
	EmpMapper empMapper;
	
    @ResponseBody
    @RequestMapping("/login")
	public String login() {
		return "用户登录了!";
	} 
    
    @ResponseBody
    @RequestMapping("/loginTest")
	public List<Account> loginTest(){
    	List <Account> list=accountClient.account();
		return list;
	} 
    
    @RequestMapping("/query")
    @ResponseBody
    public String query() {
    	
    	return empMapper.query();
    }
}
