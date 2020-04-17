package com.fantania.africanCountriesAPI.exception;

import java.util.Date;

public class ExceptionResponse {
	
	private Date timeStamp;
	private String error;
	private String message;
	
	
	public ExceptionResponse(Date timeStamo, String error, String message) {
		super();
		this.timeStamp = timeStamo;
		this.error = error;
		this.message = message;
	}
	
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamo) {
		this.timeStamp = timeStamo;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

	@Override
	public String toString() {
		return "ExceptionResponse [timeStamo=" + timeStamp + ", error=" + error + ", message=" + message + ", status="
				+ "]";
	}
	
	
	
	

}
