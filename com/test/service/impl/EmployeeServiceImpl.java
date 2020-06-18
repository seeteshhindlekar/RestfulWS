package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.test.model.Employee;
import com.test.service.EmployeeService;


//@Service("employeeService")
//@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
@Component
public class EmployeeServiceImpl implements EmployeeService 
{

//	@Autowired
// 	private EmployeeDao employeeDao;
 
//	 @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	 public void addEmployee(Employee employee) {
		 System.out.println("EmployeeServiceImpl addEmployee xxxxxxxxxxxxxxxxxxxxx");
//	  employeeDao.addEmployee(employee);
	 }
	 
	 public //List<Employee> 
	 void listEmployeess() {
//	 	  return employeeDao.listEmployeess();
	 }
	
	 public Employee getEmployee(int empid) {
		 return null;
//	  return employeeDao.getEmployee(empid);
	 }
	 
	 public void deleteEmployee(Employee employee) {
//	  employeeDao.deleteEmployee(employee);
	 }
}