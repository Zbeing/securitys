package com.zl.service;
/**
 * 
 * @author Zbeing
 *
 */
public interface ILoginService {
	/**
	 * 检测后台管理员登录
	 * @param username 用户名
	 * @param password 密码
	 * @param ip 用户ip
	 * @param usertype 用户类型
	 * @return
	 */
  boolean login(String username, String password,String ip,int usertype);
}
