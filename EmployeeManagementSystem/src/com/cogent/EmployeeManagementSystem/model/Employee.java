package com.cogent.EmployeeManagementSystem.model;

import com.cogent.EmployeeManagementSystem.exception.InvalidSalaryException;

//import lombok.Data;
//import lombok.AllArgsConstructor;

//@Data
//@AllArgsConstructor

public class Employee {
	
	public float calculateSalary() {
		return empSalary+500;
	}
 
public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) throws Exception {
		// salary is not negativeidSalary
		// if its negative invalidsalaryException
		if(empSalary>0)
		//	this.empSalary = empSalary;
		
		this.empSalary = empSalary;
		else 
			throw new InvalidSalaryException("salary should not be negative");
		
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

public Employee(String employeeId, String firstName, String lastName, float empSalary) throws Exception {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.setEmpSalary(empSalary);
	}

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
	 System.out.println("hello from employee default constructor");
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

 