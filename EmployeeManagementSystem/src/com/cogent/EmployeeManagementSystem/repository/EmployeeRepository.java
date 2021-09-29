package com.cogent.EmployeeManagementSystem.repository;

import java.io.IOException;

import com.cogent.EmployeeManagementSystem.exception.IdNotFoundException;
import com.cogent.EmployeeManagementSystem.model.Employee;

public interface EmployeeRepository {

	public String addEmployee(Employee employee);
	public String deleteEmployeeById(String id) throws IdNotFoundException, IOException;
	public void deleteAllEmployees();
	public Employee getEmployeeById(String id) throws IdNotFoundException, IOException;
	public Employee[] getEmployees();
	public String updateEmployee(String id,Employee employee) throws IdNotFoundException, IOException;
}
