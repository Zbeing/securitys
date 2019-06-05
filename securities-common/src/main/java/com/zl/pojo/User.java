package com.zl.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class User	implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 *  ID NUMBER(10) PRIMARY KEY,  --用户id
       celephone VARCHAR2(12) ,    --手机号
       username  VARCHAR2(20) ,    --用户名
       usertype  VARCHAR2(20) ,    --用户类型 普通0 管理员 1
       state     NUMBER       ,    --用户状态     
       --锁定 1 删除 -1 账户已开通 2 账户未开通 3
       pwd       VARCHAR2(50)     -- 用户密码   
 
	 * @return
	 */
	private Integer id;
	private String celephone;
	private String username;
	private Integer usertype;
	private Integer state;
	private String	pwd;
	
}
