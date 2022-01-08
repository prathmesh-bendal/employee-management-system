package com.bendal.employeemanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bendal.employeemanagementsystem.model.Employee;
import com.bendal.employeemanagementsystem.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public void addEmployee(Employee employee) {
		this.employeeRepository.save(employee);
		
	}

}
