package com.metamorphosys.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(LightException.class)
	public ResponseEntity<LightExceptionAPI> lightExcepHandler(LightException e) {
		LightExceptionAPI lightexcept = new LightExceptionAPI();
		lightexcept.setMsg(e.getMessage());
		return new ResponseEntity<LightExceptionAPI>(lightexcept, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<UserNotFoundAPI> userNotFound(UserNotFoundException e) {
		UserNotFoundAPI userNotFoundApi = new UserNotFoundAPI();
		userNotFoundApi.setMsg(e.getMessage());
		return new ResponseEntity<UserNotFoundAPI>(userNotFoundApi, HttpStatus.NOT_FOUND);
	}

}
