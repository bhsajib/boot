package com.spring.boot.myexception;

public class ErrorStatusMsg {

	private int Errorcode;
	private String msg;
	public ErrorStatusMsg(int errorcode, String msg) {
		super();
		Errorcode = errorcode;
		this.msg = msg;
	}
	public int getErrorcode() {
		return Errorcode;
	}
	public void setErrorcode(int errorcode) {
		Errorcode = errorcode;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
