package com.test.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.test.model.Employee;

@Component
public interface EmployeeService {
	
	 public void addEmployee(Employee employee);

	 public void listEmployeess();
	 
	 public Employee getEmployee(int empid);
	 
	 public void deleteEmployee(Employee employee);

}
