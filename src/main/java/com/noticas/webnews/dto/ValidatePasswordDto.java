package com.noticas.webnews.dto;

public class ValidatePasswordDto {

	public String message = "";
	public boolean success = false;
	
	public ValidatePasswordDto() {}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setValid(boolean success) {
		this.success = success;
	}
	
	
	
	
}
