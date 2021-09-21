package com.cogent.EmployeeManagementSystem.model;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor

public class Employee {
	
 
private String employeeId;
 private String firstName;
 private String lastName;
 private float empSalary;
 private String address;
 //to set the values we need setter methods
 //to retrieve values we need getter methods

 public Employee()
 {
	 this.employeeId ="";
 }
	 /*this.firstName = firstName;
	 this.lastName = lastName;
	 this.empSalary = empSalary;
	 //this.address = address;*
	  }
	  */
 



/*public Employee(String employeeId, String firstName, String lastName, float empSalary) {
		super();
		this.employeeId = employeeId;
}*/
		/*this.firstName = firstName;
		this.lastName = lastName;
		this.empSalary = empSalary;*/
	
}

 