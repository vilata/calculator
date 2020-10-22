package com.iteriam.calculator.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(value = {Exception.class})
	public ResponseEntity<Object> handleAntException(Exception e, WebRequest request){
		String error = e.getLocalizedMessage();
		if(null == error) error = e.toString();
		ExceptionMsg exceptionMsg = new ExceptionMsg(new Date(), error);
		return new ResponseEntity<Object>(exceptionMsg,new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = {NumberFormatException.class})
	public ResponseEntity<Object> handleNumberFormatException(NumberFormatException e, WebRequest request){
		String error = e.getLocalizedMessage();
		if(null == error) error = e.toString();
		ExceptionMsg exceptionMsg = new ExceptionMsg(new Date(), error);
		return new ResponseEntity<Object>(exceptionMsg,new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = {MethodArgumentTypeMismatchException.class})
	public ResponseEntity<Object> handleMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException e, WebRequest request){
		String error = e.getLocalizedMessage();
		if(null == error) error = e.toString();
		ExceptionMsg exceptionMsg = new ExceptionMsg(new Date(), error);
		return new ResponseEntity<Object>(exceptionMsg,new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	
	
	
}
