package com.cogent.EmployeeManagementSystem.repository;

import java.io.IOException;
import java.util.ArrayList;

import com.cogent.EmployeeManagementSystem.exception.IdNotFoundException;
import com.cogent.EmployeeManagementSystem.model.Employee;

public class EmployeerepositoryALImpl implements EmployeeRepository {

	// Singleton Design Pattern

	private static EmployeeRepository employeeRepository;

	
	public static EmployeeRepository getInstance() {
		if (employeeRepository == null) {
			employeeRepository = new EmployeerepositoryALImpl();
			return employeeRepository;
		}
		return employeeRepository;
	}

	private   EmployeerepositoryALImpl() {
		// TODO Auto-generated method stub
		
	}

	private ArrayList<Employee> employees = new ArrayList<>();
	// 10 employees
	// when we will add 11th employee details it will grow automatically

	// <Employee>====> we are informing that we will hold only employee type objects
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		boolean status = employees.add(employee);
		if (status)
			return "success";

		else
			return "fail";
	}

	@Override
	public String deleteEmployeeById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getEmployeeById(String id) throws IdNotFoundException, IOException {
		// TODO Auto-generated method stub

		// 1. we need to traverse the array list.
		for (Employee employee : employees) {
			if (id.equals(employee.getEmployeeId()))
				return employee;
			// System.out.println(employee);
		}
		// 2. we need to use java 8 features.

		return null;
	}

	@Override
	public Employee[] getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
