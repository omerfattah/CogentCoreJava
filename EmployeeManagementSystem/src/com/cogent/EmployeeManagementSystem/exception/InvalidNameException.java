package com.cogent.EmployeeManagementSystem.exception;

import lombok.ToString;

@ToString
public class InvalidNameException extends RuntimeException { //UnChecked Exception
	public InvalidNameException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
		
	}
}
