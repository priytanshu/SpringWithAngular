package org.demo.web;

import java.util.List;

import org.demo.model.Employee;
import org.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin(origins = {"https://localhost:4200"}, maxAge = 4800, allowCredentials = "false")
public class RestController {

	@Autowired
	EmployeeService empS;
	
	@CrossOrigin("http://localhost:4200/api/hello")
	@RequestMapping("/api/hello")
	public List<Employee> greet(){
		return empS.listEmployee();
	}
	
	@RequestMapping("/api/angular")
	public String greetAngular(){
		return "Hello from Angular Controller";
	}
}
