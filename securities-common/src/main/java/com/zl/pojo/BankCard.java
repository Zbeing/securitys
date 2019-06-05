package com.zl.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class BankCard implements Serializable{
	private static final long serialVersionUID = 1L;
	/**
	 *  ID NUMBER(10) PRIMARY KEY         ,  -- id;
        cardnum VARCHAR2(20) NOT NULL     ,  --卡号
        balance NUMBER                    ,  --余额
      -- pwd     VARCHAR2(50) NOT NULL     ,  --密码       
        user_id number(10)   NOT NULL     ,  --用户id
        bank_type VARCHAR2(20)            ,  --所属银行
        state     NUMBER                     --状态 审 0 绑1 解 -1  
	 */
	private Integer id;
	private String cardnum;
	private BigDecimal balance;
	private String pwd;
	private Integer user_id;
	private Integer state;
	
}
