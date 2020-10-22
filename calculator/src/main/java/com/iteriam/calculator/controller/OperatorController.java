package com.iteriam.calculator.controller;

import java.math.BigDecimal;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

public interface OperatorController {
	
	@ApiOperation(value = "Result operation")
	@ApiResponses(value = {@ApiResponse (code = 200 ,message = "Resquest success"), @ApiResponse (code = 400 ,message = "Verify endpoint")})
	@RequestMapping(value = "/resultOperation" , method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	ResponseEntity<BigDecimal> getResultOperator(@RequestParam(name = "parameter1", required = true) BigDecimal parameter1,
												 @RequestParam(name = "parameter2" , required = true) BigDecimal parameter2,
												 @RequestParam(name = "operator" , required = true) String operator);

}
