package com.iteriam.calculator.service;

import java.math.BigDecimal;

public interface OperatorService {

	
	double calculateResult(BigDecimal parameter1,BigDecimal parameter2, String operator);
}
