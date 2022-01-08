package com.bendal.employeemanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bendal.employeemanagementsystem.model.Employee;
import com.bendal.employeemanagementsystem.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("listEmployees", employeeService.getAllEmployees());
		return "index";
	}
	
	@GetMapping("/showNewEmployeeForm")
	public String showNewEmployeeform(Model model) {
		Employee employee=new Employee();
		model.addAttribute("employee", employee);
		return "newEmployee";
	}
	
	@PostMapping("/saveEmployee")
	 public String saveEmployee(@ModelAttribute("employee") Employee employee) {
	     employeeService.addEmployee(employee);
	     return "redirect:/";
	 }
}
