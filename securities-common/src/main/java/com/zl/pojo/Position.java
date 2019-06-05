package com.zl.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class Position implements Serializable{
	private static final long serialVersionUID = 1L;
	/**
	 * ID NUMBER PRIMARY KEY, 
     stockcode VARCHAR2(6), --证券代码
     stockname VARCHAR2(20), --证券名称
     stocknum number, --股票持有量
     freezenum NUMBER, --冻结数量
     shareprice NUMBER --股票成本价
	 */
	private Integer id;
	private Integer stockcode;
	private Integer stockname;
	private Integer stocknum;
	private Integer freezenum;
	private BigDecimal shareprice;
	
}
