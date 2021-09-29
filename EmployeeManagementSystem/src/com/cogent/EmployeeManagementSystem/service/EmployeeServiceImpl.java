package com.cogent.EmployeeManagementSystem.service;

import java.io.IOException;

import com.cogent.EmployeeManagementSystem.exception.IdNotFoundException;
import com.cogent.EmployeeManagementSystem.model.Employee;
import com.cogent.EmployeeManagementSystem.repository.EmployeeRepository;
import com.cogent.EmployeeManagementSystem.repository.EmployeerepositoryALImpl;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeRepository employeeRepository = EmployeerepositoryALImpl.getInstance();

	// are we consuming the repo?
	// loose coupling:

	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.addEmployee(employee);
	}

	public Employee getEmployeeById(String id) throws IdNotFoundException, IOException {
		return employeeRepository.getEmployeeById(id);
	}

	public Employee[] getEmployees() {
		return employeeRepository.getEmployees();
	}

	@Override
	public String deleteEmployeeById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		employeeRepository.deleteAllEmployees();

	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	public static EmployeeService getInstance() {
		// TODO Auto-generated method stub
		return employeeService();
	}

	private static EmployeeService employeeService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee[] getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
