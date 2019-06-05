package com.zl.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class BuySell implements Serializable{
	private static final long serialVersionUID = 1L;
	/**
	 *  ID NUMBER(10) PRIMARY KEY         ,  -- id;
     securityCode  NUMBER  NOT NULL    ,  --证券代码
     NAME    varchar2(10)  NOT NULL    ,  --证券名称
     aim_number NUMBER     NOT NULL    ,  --委托数量
     do_money   NUMBER     NOt NULL    ,  --成交股价
     real_num   NUMBER                 ,  --成交数量
     o_option     NUMBER                 ,  --操作   买 0 卖 1
     publictime DATE                   ,  --发布时间 
     optime     DATE                   ,  --操作时间   成/撤
     opstate    number                 ,  --全1 未0 撤-1 部2
     commision  NUMBER                 ,  --佣金 
     stamp_duty NUMBER                    --印花税     
	 */
	private Integer id;
	private String securityCode;
	private String name;
	private Integer aim_number;
	private BigDecimal do_money;
	private Integer real_num;
	private Integer o_option;
	private Date publictime;
	private Date optime;
	private Integer opstate;
	private BigDecimal commision;
	private BigDecimal stamp_duty;
}
