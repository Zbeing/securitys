package com.zl.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class Account implements Serializable{
	private static final long serialVersionUID = 1L;
	/*
	 * user_id NUMBER(10) NOt NULL , --引用用户id allbalance NUMBER , --总共余额 usebalance
	 * NUMBER , --可用余额 icebalance NUMBER , --冻结金额 pwd VARCHAR2(50) , --交易密码 TYPE
	 * NUMBER , --账户类型 深 1 ,沪 2 address VARCHAR2(50) --营业部
	 */
	private Integer user_id;
	private BigDecimal allbalance;
	private BigDecimal usebalance;
	private BigDecimal icebalance;
	private String pwd;
	private Integer type;
	private Integer address;
}
