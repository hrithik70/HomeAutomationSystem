package com.metamorphosys.exception;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UserNotFoundException() {
		System.out.println("User id not found..");
	}

	public UserNotFoundException(String msg) {
		super(msg);
	}
}
