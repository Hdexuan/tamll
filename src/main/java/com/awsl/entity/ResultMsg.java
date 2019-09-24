package com.awsl.entity;

public class ResultMsg {
	private int code;
	private String msg;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "ResultMsg [code=" + code + ", msg=" + msg + "]";
	}
	public ResultMsg(int code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}
	public ResultMsg() {
		super();
	}
	
	

}
