package com.iteriam.calculator.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.iteriam.calculator.service.OperatorService;

import io.corp.calculator.TracerImpl;

@RestController
public class OperatorControllerImpl implements OperatorController{
	
	@Autowired
	private OperatorService operatorService;
	
	private TracerImpl tracer = new TracerImpl();
	
	@Override
	public ResponseEntity<BigDecimal> getResultOperator(BigDecimal parameter1, BigDecimal parameter2, String operator) {

		BigDecimal calculateResult = operatorService.calculateResult(parameter1, parameter2, operator);
		tracer.trace("Result operation: " +calculateResult);
		return new ResponseEntity(calculateResult,HttpStatus.OK);
	}

}
