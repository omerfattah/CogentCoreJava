package com.cogent.EmployeeManagementSystem.exception;

import lombok.ToString;

@ToString

public class IdNotFoundException extends Exception {  //Checked Exception

	public IdNotFoundException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
		
	}

}
