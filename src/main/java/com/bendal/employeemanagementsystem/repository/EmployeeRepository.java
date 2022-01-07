package com.bendal.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bendal.employeemanagementsystem.model.Employee;


@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}
