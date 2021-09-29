package com.cogent.EmployeeManagementSystem;

import java.io.IOException;

import com.cogent.EmployeeManagementSystem.exception.IdNotFoundException;
import com.cogent.EmployeeManagementSystem.model.Employee;
import com.cogent.EmployeeManagementSystem.service.EmployeeService;
import com.cogent.EmployeeManagementSystem.service.EmployeeServiceImpl;

public class Main {
	public static void main(String args[])  {
		
		EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
		
		try {
			String result=null;
			
			 result=employeeService.addEmployee(new Employee("md001","md","omer",123.0f));
			
			if("success".equals(result)) {
				System.out.println(("employee added successfully"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	
		 
		 //will terminate execution because it went from checked exp to unchecked exception
//		EmployeeService employeeService = new EmployeeService();
//		Employee employee = new Employee("ome01", "omer", "mohd", 1.0f);
//		
//		String result = employeeService.addEmployee(employee);
//		System.out.println(result);
//
//		Employee[] employees = employeeService.getEmployees();
//
//		for (Employee employee2 : employees) {
//			System.out.println(employee2);
//		}
// EmployeeService employeeService =EmployeeServiceImpl.getInstance();
// try {
//	Employee employee = employeeService.getEmployeeById("abc002");
//} catch (IdNotFoundException | IOException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
// 
 
//		employeeService.deleteAllEmployees();
//		employeeService.updateEmployee("omer", employee);
//		employeeService.getEmployeeByName("omer");
		
		
		
		


	}
	
}

/*
 * Employee employee=new Employee(); //classname ref = object
 * 
 * Employee employee2=new Employee("ome001","omer","mohd",100.0f,"tx");
 * System.out.println(employee2.getEmployeeId());
 * 
 * 
 * 
 * Employee employee3 = null; //System.out.println(employee3.getAddress());
 * /*System.out.println(employee2.getFirstName());
 * System.out.println(employee2.getLastName());
 * System.out.println(employee2.getEmpSalary());
 * System.out.println(employee2.getAddress())
 * 
 * 
 * Employee employees[]=new Employee[10]; for (int i = 0; i < employees.length;
 * i++) { employees[i]=new Employee(); }
 * 
 * for (Employee employee4 : employees) { System.out.println(employee4);
 ***
 * 
 */
