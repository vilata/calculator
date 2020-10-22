package com.iteriam.calculator;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.iteriam.calculator.service.OperatorService;
import com.iteriam.calculator.service.OperatorServiceImpl;

@SpringBootTest
class CalculatorApplicationTests {
	
	private static OperatorService operatorService;

	@BeforeAll
	public static void setup() {
		operatorService = new OperatorServiceImpl();
	}
		
	@Test
	public void sumOperation() {
		BigDecimal parameter1 = new BigDecimal(1);
		BigDecimal parameter2 = new BigDecimal(3);
		String symbol = "+";
		double result = operatorService.calculateResult(parameter1, parameter2, symbol);
		Assertions.assertEquals(4, result);
	}
	
	@Test
	public void substractOperation() {
		BigDecimal parameter1 = new BigDecimal(4);
		BigDecimal parameter2 = new BigDecimal(2);
		String symbol = "-";
		double result = operatorService.calculateResult(parameter1, parameter2, symbol);
		Assertions.assertEquals(2, result);
	}
	
	@Test
	public void multiplyOperation() {
		BigDecimal parameter1 = new BigDecimal(4);
		BigDecimal parameter2 = new BigDecimal(2);
		String symbol = "*";
		double result = operatorService.calculateResult(parameter1, parameter2, symbol);
		Assertions.assertEquals(8, result);
	}
	
	@Test
	public void divideOperation() {
		BigDecimal parameter1 = new BigDecimal(8);
		BigDecimal parameter2 = new BigDecimal(2);
		String symbol = "/";
		double result = operatorService.calculateResult(parameter1, parameter2, symbol);
		Assertions.assertEquals(4, result);
	}

}
