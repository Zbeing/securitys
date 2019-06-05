package com.zl.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/**
	 *  user_id NUMBER(10) ,            -- 引用用户id
       realauth_id NUMBER(10) ,   --引用实名认证表id
       risk_id     number(10)    --引用风评表id
	 */
	
	private Integer user_id;
	private Integer realauth_id;
	private Integer risk_id;
}
