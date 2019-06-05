package com.zl.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.pojo.Account;

@Controller
@RequestMapping("/account")
public class AccountController {
	
	@ResponseBody
    @RequestMapping("/accounts")
	public List<Account> account(){
    	Account a1 = new Account();
		return null;
	} 
}
