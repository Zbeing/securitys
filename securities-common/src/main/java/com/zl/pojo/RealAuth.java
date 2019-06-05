package com.zl.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class RealAuth implements Serializable{
	private static final long serialVersionUID = 1L;
	/**
	 *  ID NUMBER(10) PRIMARY KEY         ,  -- id;
       realname  VARCHAR2(20) NOT NULL   ,  --真实姓名
       idcardnum VARCHAR2(20) NOT NULL   ,  --身份证号
       gender    NUMBER(2)    NOT NULL   ,  --性别
       birthday  VARCHAR2(20) NOT NULL   ,  --出生日期
       state     number(1)    NOT NULL   ,  --审核状态 过1 拒 -1 待 0
       apply_id  NUMBER(10)   NOt NULL   ,  --申请者id
       apply_time DATE        NOT NULL   ,  --申请时间
       auth_id    NUMBER(10)             ,  --审核者id
       auth_time  DATE                   ,  --审核时间
       img_1      VARCHAR2(50) NOT NULL  ,  --身份证正面
       img_2      VARCHAR2(50) NOT NULL  ,  --身份证反面
       img_3      VARCHAR2(50) NOT NULL  ,  --本人照片
       vedio      VARCHAR2(50)              --验证视频
	 */
	private Integer id;
	private String realname;
	private String idcardnum;
	private Integer gender;
	private String birthday;
	private Integer state;
	private Integer apply_id;
	private Date apply_time;
	private Integer auth_id;
	private Date auth_time;
	private String img_1;
	private String img_2;
	private String img_3;
	private String vedio;

}
