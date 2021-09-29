package com.cogent.EmployeeManagementSystem.service;

import java.io.IOException;

import com.cogent.EmployeeManagementSystem.exception.IdNotFoundException;
import com.cogent.EmployeeManagementSystem.model.Employee;

public interface EmployeeService {
	public String addEmployee(Employee employee);
	public String deleteEmployeeById(String id);
	public void deleteAllEmployees();
	public Employee getEmployeeById(String id) throws IdNotFoundException, IOException;
	public Employee[] getEmployeeByName(String name);
	public Employee[] getEmployees();
	public String updateEmployee(String id,Employee employee);

}
