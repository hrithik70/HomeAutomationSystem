package com.metamorphosys.exception;

public class UserNotFoundAPI {

	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "UserNotFoundAPI [msg=" + msg + "]";
	}

	public UserNotFoundAPI(String msg) {
		super();
		this.msg = msg;
	}

	public UserNotFoundAPI() {
		super();
		// TODO Auto-generated constructor stub
	}

}
