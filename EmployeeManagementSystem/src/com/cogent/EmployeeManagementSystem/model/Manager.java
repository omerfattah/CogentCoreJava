package com.cogent.EmployeeManagementSystem.model;

public class Manager extends Employee {

	private String managerId;
	private float projectAllow;
	
	@Override
	public float calculateSalary() {
		// TODO Auto-generated method stub
		return super.calculateSalary();
	}
	

	public String getManagerId() {
		return managerId;
	}


	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}


	public float getProjectAllow() {
		return projectAllow;
	}


	public void setProjectAllow(float projectAllow) {
		this.projectAllow = projectAllow;
	}


	public Manager() {
		this("","","",1000.0f,1000.0f,"");// call to another constructor from the same class

	}

	public Manager(String empId, String firstName, String lastName, float empSalary, float projectAllow,
			String managerId) {
      super(empId,firstName,lastName,empSalary); //it will give call to a constructor from parent class 
	
	this.projectAllow=projectAllow;
	this.managerId="manager";
	
	}
}
