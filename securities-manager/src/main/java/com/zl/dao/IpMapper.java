package com.zl.dao;

import com.zl.pojo.Iplog;
/**
 * 
 * @author Zbeing
 *
 */
public interface IpMapper {
	/**
	 * 管理员登录加入一条登录数据
	 * @param iplog
	 */
 void addip(Iplog iplog);
}
