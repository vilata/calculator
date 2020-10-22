package com.iteriam.calculator.service;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.iteriam.calculator.model.SymbolOperation;

@Service
public class OperatorServiceImpl implements OperatorService{
	
	private static final Logger log = LoggerFactory.getLogger(OperatorServiceImpl.class);
	
	@Override
	public double calculateResult(BigDecimal parameter1, BigDecimal parameter2, String symbol) {

		if(log.isDebugEnabled()) {
			log.debug("Parameter1 : " + parameter1+ " Parameter2 : " + " Symbol operation : " + symbol);
		}
		SymbolOperation so = SymbolOperation.getOperatorSymbol(symbol);
		
			switch (so) {
			case SUM:
				return parameter1.add(parameter2).doubleValue();
			case SUBSTRACT:
				return parameter1.subtract(parameter2).doubleValue();	
			case MULTIPLY:
				return parameter1.multiply(parameter2).doubleValue();
			case DIVIDE:
				return parameter1.divide(parameter2).doubleValue();
			default:
				throw new RuntimeException("Not found Operation");
			}
		
	}
	

}
