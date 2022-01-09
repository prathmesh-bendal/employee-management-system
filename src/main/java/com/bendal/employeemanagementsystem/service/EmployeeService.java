package com.bendal.employeemanagementsystem.service;

import java.util.List;

import com.bendal.employeemanagementsystem.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void addEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);

}
