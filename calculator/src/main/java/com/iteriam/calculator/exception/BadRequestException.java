package com.iteriam.calculator.exception;

public class BadRequestException extends RuntimeException{
	
	private static final String DESCRIPTION = "Not Found Exception 400";
	
	public BadRequestException(String detail) {
		super(DESCRIPTION + ". "+ detail);
	}

}
