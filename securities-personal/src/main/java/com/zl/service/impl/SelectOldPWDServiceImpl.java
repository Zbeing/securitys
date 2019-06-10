package com.zl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.SelectOldPWDMapper;
import com.zl.pojo.User;
import com.zl.service.SelectOldPWDService;
@Service
public class SelectOldPWDServiceImpl implements SelectOldPWDService {
	@Autowired
	private SelectOldPWDMapper selectOldPWDMapper;
	@Override
	public User selectOldPwd(String username) {
		return selectOldPWDMapper.selectOldPWD(username);
	}

}
