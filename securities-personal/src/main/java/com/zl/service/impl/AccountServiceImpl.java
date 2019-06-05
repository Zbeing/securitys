package com.zl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.AccountMapper;
import com.zl.pojo.Account;
import com.zl.service.IAccountService;
@Service
public class AccountServiceImpl implements IAccountService{
	
	@Autowired
	private AccountMapper accountMapper;
	
	@Override
	public Account queryAccount(Integer user_id) {
		return accountMapper.queryAccount(user_id);
	}

}
