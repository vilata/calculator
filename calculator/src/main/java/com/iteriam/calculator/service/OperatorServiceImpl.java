package com.iteriam.calculator.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.iteriam.calculator.exception.BadRequestException;
import com.iteriam.calculator.model.SymbolOperation;

@Service
public class OperatorServiceImpl implements OperatorService{
	
	private static final Logger log = LoggerFactory.getLogger(OperatorServiceImpl.class);
	/**
	 *NUMBER_PRECISION : Number from the ',' in operation divide
	 */	
	private static final int NUMBER_PRECISION = 2;
	
	/**
	 * Method for calculate value to parameter1 , parameter2 with symbol pass
	 * @param BigDecimal parameter1, BigDecimal parameter2, String symbol
	 * @return BigDecimal
	 */
	@Override
	public BigDecimal calculateResult(BigDecimal parameter1, BigDecimal parameter2, String symbol) {

		if(log.isDebugEnabled()) {
			log.debug("Parameter1 : " + parameter1+ " Parameter2 : " + " Symbol operation : " + symbol);
		}
		SymbolOperation so = SymbolOperation.getOperatorSymbol(symbol);
		
			switch (so) {
			case SUM:
				return parameter1.add(parameter2);
			case SUBSTRACT:
				return parameter1.subtract(parameter2);	
			case MULTIPLY:
				return parameter1.multiply(parameter2);
			case DIVIDE:
				return parameter1.divide(parameter2, NUMBER_PRECISION, RoundingMode.FLOOR);
			default:
				throw new BadRequestException("Not found Operation");
			}
		
	}
	
}
