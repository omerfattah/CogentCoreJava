package com.cogent.EmployeeManagementSystem.service;
import com.cogent.EmployeeManagementSystem.model.Employee;
import com.cogent.EmployeeManagementSystem.repository.EmployeeRepository;

public class EmployeeService {
	EmployeeRepository employeeRepository = EmployeeRepository.getInstance();
	

	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.addEmployee(employee);
	}
	public Employee getEmployeeById(String id)
	{
		return employeeRepository.getEmployeeById(id);
	}
}
