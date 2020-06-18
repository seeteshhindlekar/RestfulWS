package com.test.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Employee;
import com.test.service.EmployeeService;


@RestController
@RequestMapping("/sweet")
public class SeetRestController {

	 @Autowired
	 private EmployeeService employeeService;

	 @GetMapping
	    public void findAll() {
	        System.out.println("findAll method in RestController");
			  Employee employee = prepareModel();
			  employeeService.addEmployee(employee);
	    } 
	 
	 private Employee prepareModel(){
		  Employee employee = new Employee();
//		  employee.setId(100);
		  employee.setFirstName("Seetesh");
		  employee.setLastName("Hindlekar");
		  employee.setSalary(100);
		  return employee;
	 }
	 

	 /*
	 
	@RequestMapping(value = "/sam", method = RequestMethod.GET)
	
//	public ModelAndView welcome(@ModelAttribute("command")EmployeeBean employeeBean, 
//			   BindingResult result) {
	public ModelAndView welcome() {
		  Employee employee = prepareModel();
		  employeeService.addEmployee(employee);
		return new ModelAndView("index");
	}

	 private Employee prepareModel(){
		  Employee employee = new Employee();
//		  employee.setId(100);
		  employee.setFirstName("Seetesh");
		  employee.setLastName("Hindlekar");
		  employee.setSalary(100);
		  return employee;
	 }

		@RequestMapping("/helloworld")
	    public String handler(Model model) {

	        HelloWorld helloWorld = new HelloWorld();
	        helloWorld.setMessage("Seetesh dsfsfsf ddd Hello World Example Using Spring MVC 5!!!");
	        helloWorld.setDateTime(LocalDateTime.now().toString());
	        model.addAttribute("helloWorld", helloWorld);
	        return "helloworld";
		}
		
		@RequestMapping("/index")
	    public String handler1(Model model) {
	        return "index";
		}
		

		@RequestMapping("/hello")
	    public String handler2(Model model) {
	        model.addAttribute("message", "Spring 3.0 MVC Framework Hello World Example!");
	        model.addAttribute("auther", "Testing in progress");
	        return "hello";
		}

		@RequestMapping("/login")
	    public String handlerlogin(Model model) {
	        return "login";
		}

		@RequestMapping("/register")
	    public String handlerregister(Model model) {
	        return "empregister";
		}
		*/
		
}
