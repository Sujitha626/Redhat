package org.example.dao;

@SuppressWarnings("serial")
public class EmployeeNotFoundException extends Exception {
	
	private String message;

	public EmployeeNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	

}