package com.zl.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class RiskAssessment implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
       ID NUMBER(10) PRIMARY KEY         ,  -- id;
       user_id NUMBER(10)    NOt NULL    ,  --引用用户id
       score   number(3)     NOT NULL    ,  --风评分数
       risk_class  VARCHAR2(20) NOT NULL   --评估定级 

	 */
	private Integer id;
	private Integer user_id;
	private Integer score;
	private String risk_class;


}
