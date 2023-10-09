package com.metamorphosys.exception;

public class LightExceptionAPI {

	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "LightExceptionAPI [msg=" + msg + "]";
	}

	public LightExceptionAPI(String msg) {
		super();
		this.msg = msg;
	}

	public LightExceptionAPI() {
		super();
		// TODO Auto-generated constructor stub
	}

}
