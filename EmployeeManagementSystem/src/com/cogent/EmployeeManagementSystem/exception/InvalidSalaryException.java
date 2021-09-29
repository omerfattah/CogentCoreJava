package com.cogent.EmployeeManagementSystem.exception;

import lombok.ToString;

@ToString
public class InvalidSalaryException extends Exception { //UnChecked Exception
	public InvalidSalaryException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}

}
