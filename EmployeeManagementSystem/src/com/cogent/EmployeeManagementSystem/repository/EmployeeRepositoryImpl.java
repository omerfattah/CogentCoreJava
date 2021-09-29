package com.cogent.EmployeeManagementSystem.repository;

import java.io.IOException;

import com.cogent.EmployeeManagementSystem.exception.IdNotFoundException;
import com.cogent.EmployeeManagementSystem.model.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {
	private Employee employees[] = new Employee[10];

	private static EmployeeRepository employeeRepository;

	private EmployeeRepositoryImpl() {

	}
	
	private static int index=0;
	public Employee[] getEmployeeByName(String name) {
		Employee[] employeesTemp=new Employee[employees.length];
		for(Employee employee:employees) {
			if(employee.getFirstName().equals(name)) {
				employeesTemp[index++] = employee;
			}
		}
		return employeesTemp;
	}

	public static EmployeeRepository getInstance() {
		if (employeeRepository == null) {
			employeeRepository = new EmployeeRepositoryImpl();
			return employeeRepository;
		}
		return employeeRepository;
	}

	static int counter = -1;

	public String addEmployee(Employee employee) {

		if (counter >= employees.length) {
			System.out.println("array is full");
		}

		employees[++counter] = employee;
		return "SUCCESS";
	}

	public Employee getEmployeeById(String id) throws IdNotFoundException,IOException {
		// it will throw the checked exception to the caller
		for (Employee employee : employees) {

			if (employee != null && id.equals(employee.getEmployeeId())) {
				return employee;
				//throw new IOException();
			}
			

		}

		throw new IdNotFoundException("id not found");
		// it will throw the exception

	}

	public Employee[] getEmployees() {
		return employees;
	}

	public String deleteEmployeeById(String id) throws IdNotFoundException, IOException {
		Employee employee = this.getEmployeeById(id);
		if (employee != null) {

			int index = this.getIndex(employee);

			if (index != -1) {
				employees[index] = null;
				return "success";
			} else {
				return "not found";
			}

		}
		return "not found";

	}

	private int getIndex(Employee employee) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].equals(employee)) {
				return i;
			}

		}
		return -1;
	}

	@Override
	public void deleteAllEmployees() {
		
		employees=null;
	}

	@Override
	public String updateEmployee(String id, Employee employee) throws IdNotFoundException, IOException {
		this.getEmployeeById(id);
		int index = this.getIndex(employee);
		employees[index]= employee;
		return "success";
			
		
		
	}
}