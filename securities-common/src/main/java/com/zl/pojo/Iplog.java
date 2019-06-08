package com.zl.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class Iplog implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/**登录成功*/
	public  static final int STATE_SUCCESS=1;
	/**登录失败*/
	public static final int STATE_FINAL=0;
	
	
	/**
	 *  ID       NUMBER(10) PRIMARY KEY  ,  -- id;
       ip       VARCHAR2(20) NOT NULL   ,  --登录ip
       username VARCHAR2(20) NOT NULL   ,  --登录用户名
       logintime VARCHAR2(20) NOT NULL  ,  --时间
       state     NUMBER       NOT NULL     --登录状态,成功1 失败0
	 */
	private Integer id;
	private String ip;
	private String username;
	private Date logintime;
	private Integer state;
}
