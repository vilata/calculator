package com.iteriam.calculator.exception;

import java.util.Date;

public class ExceptionMsg {

	private Date date;
	private String msg;
	
	public ExceptionMsg() {
		
	}
	
	public ExceptionMsg(Date date, String msg) {
		this.date = date;
		this.msg = msg;
	}


	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
