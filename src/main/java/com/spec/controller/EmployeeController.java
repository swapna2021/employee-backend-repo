package com.spec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spec.entities.Employee;
import com.spec.service.EmployeeService;

@CrossOrigin("*")
@RestController
//its a combination of @Controller+@ResponseBody
public class EmployeeController {
	
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployees(){
		return service.getAllEmployees();
		
	}
	
	@PostMapping(value="/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
	}
	
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable("id") int id) {
		return service.getEmployeeById(id);
	}
	
	@PutMapping(value="/employee/{id}")
	public Employee updateEmployee(@PathVariable("id") int id,@RequestBody Employee employee) {
		return service.updateEmployee(id,employee);
	}
	

	@DeleteMapping(value="/employee/{id}")
	public void deleteEmployee(@PathVariable("id") int id) {
	service.deleteEmployee(id);
	}

}
