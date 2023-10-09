package com.metamorphosys.exception;

public class LightException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public LightException() {
		System.out.println("Light's Brightness is too High");
	}

	public LightException(String msg) {
		super(msg);
	}

}
