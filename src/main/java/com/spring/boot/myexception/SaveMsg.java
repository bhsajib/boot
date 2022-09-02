package com.spring.boot.myexception;

public class SaveMsg {
	
	private int Code; 
	private String msg ;
	public SaveMsg(int code, String msg) {
		super();
		Code = code;
		this.msg = msg;
	}
	public int getCode() {
		return Code;
	}
	public void setCode(int code) {
		Code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	} 
	

}
