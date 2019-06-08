package com.zl.service.impl;



import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Service;

import com.zl.dao.IpMapper;
import com.zl.dao.LoginMapper;
import com.zl.pojo.Iplog;
import com.zl.pojo.User;
import com.zl.service.ILoginService;
import com.zl.util.MD5;
/**
 * 
 * @author Zbeing
 *
 */

@Service("loginService")
public class LoginServiceImpl implements ILoginService {

	
	@Inject
	@Named("loginMapper")
	private LoginMapper loginMapper;
	@Inject
	@Named("ipMapper")
	private IpMapper ipMapper;
	
	@Override
	public boolean login(String username, String password, String ip,int usertype) {
		System.out.println("service");
		// TODO Auto-generated method stub
		Iplog iplog=new Iplog();//iplog 管理员登录日志
		iplog.setIp(ip);
		iplog.setLogintime(new java.util.Date());
		iplog.setUsername(username);
		iplog.setState(Iplog.STATE_FINAL);
		User user =loginMapper.login(username,MD5.encode(password),usertype); 
		if(user!=null) {
			iplog.setState(Iplog.STATE_SUCCESS);
		}
		ipMapper.add(iplog);
		return user!=null;
	}

}
