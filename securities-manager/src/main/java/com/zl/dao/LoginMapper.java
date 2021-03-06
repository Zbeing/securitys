package com.zl.dao;

import org.apache.ibatis.annotations.Param;

import com.zl.pojo.User;

/**
 * 
 * @author Zbeing
 *
 */
public interface LoginMapper {
/**
 * 管理员登录
 * @param usertype 
 * @param password MD5加密的密码
 * @param username 
 * @return 返回一个user 对象
 */
	User select(@Param("username")String username, @Param("pwd")String password, @Param("usertype")int usertype);
}
