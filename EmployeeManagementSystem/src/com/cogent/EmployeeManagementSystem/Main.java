package com.cogent.EmployeeManagementSystem;

import com.cogent.EmployeeManagementSystem.model.Employee;
import com.cogent.EmployeeManagementSystem.service.EmployeeService;
public class Main {
	public static void main(String args[]) {
	  EmployeeService employeeService =new EmployeeService();
	  Employee employee =new Employee("ome01","omer","mohd",1.0f,"tx");
	  
	  String result=employeeService.addEmployee(employee);
	  System.out.println(result);
		
	}
	
}








































/*
Employee employee=new Employee();
//classname ref = object

Employee employee2=new Employee("ome001","omer","mohd",100.0f,"tx");
System.out.println(employee2.getEmployeeId());



Employee employee3 = null;
//System.out.println(employee3.getAddress());
/*System.out.println(employee2.getFirstName());
System.out.println(employee2.getLastName());
System.out.println(employee2.getEmpSalary());
System.out.println(employee2.getAddress())


Employee employees[]=new Employee[10];
for (int i = 0; i < employees.length; i++) {
	employees[i]=new Employee();
}

for (Employee employee4 : employees) {
	System.out.println(employee4);
***

*/
