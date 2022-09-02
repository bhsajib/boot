package com.spring.boot.myexception;

import org.springframework.stereotype.Component;

@Component
public class CoustomerException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int errorCode;
	private String errorMsg;
	private ErrorStatusMsg er;
	
	public CoustomerException()
	{
		
	}
	
	
	public CoustomerException(int errorCode, String errorMsg, ErrorStatusMsg re) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.er = er;
	}


	public int getErrorCode() {
		return errorCode;
	}


	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}


	public String getErrorMsg() {
		return errorMsg;
	}


	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}


	
	public ErrorStatusMsg getEr() {
		return er;
	}


	public void setEr(ErrorStatusMsg er) {
		this.er = er;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
