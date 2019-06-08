package com.zl.util;

import java.io.Serializable;

public class Viewjson implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	private boolean success = true;
	private String msg;
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Viewjson(boolean success, String msg) {
		super();
		this.success = success;
		this.msg = msg;
	}
	public Viewjson() {
	}
	public Viewjson(String msg) {
		this.msg = msg;
	}
	


}
