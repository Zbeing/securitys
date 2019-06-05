package com.zl.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class BankRecord implements Serializable{
	private static final long serialVersionUID = 1L;
	/**
	 *  ID NUMBER(10) PRIMARY KEY         ,  -- id;
       card_id NUMBER                    ,  --银行卡id
       user_id NUMBER                    ,  --对应账户id
       money   NUMBER                    ,  --金额
       dotime  DATE                      ,  --操作时间
       state   NUMBER                       --充1 取 0 
	 */
	private Integer id;
	private Integer card_id;
	private Integer user_id;
	private Integer money;
	private Date dotime;
	private Integer state;
	
}
