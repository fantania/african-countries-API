package com.fantania.africanCountriesAPI.exception;

import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
		
		ExceptionResponse exeption = new ExceptionResponse(new Date(), (HttpStatus.INTERNAL_SERVER_ERROR).toString(), ex.getMessage());
		
		return new ResponseEntity<Object>(exeption, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@ExceptionHandler
	public final ResponseEntity<Object> handleCountryNotFoundException(CountryNotFoundException ex, WebRequest request) {
		
		ExceptionResponse exeption = new ExceptionResponse(new Date(), (HttpStatus.NOT_FOUND).toString(), ex.getMessage());
		
		return new ResponseEntity<Object>(exeption, HttpStatus.NOT_FOUND);
	}


}
