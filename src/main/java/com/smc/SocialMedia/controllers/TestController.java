package com.smc.SocialMedia.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smc.SocialMedia.models.Employee;
import com.smc.SocialMedia.security.services.EmployeeService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class TestController {
	
	
	@Autowired
	EmployeeService empService;
	
	
	@GetMapping("/getmployees")
	public List<Employee> getEmp() {
		return empService.getAllEmployees();
	}
	
	@PostMapping("/addemployee")
	public Employee addEmp(@RequestBody Employee employee) {
		return empService.addEmployee(employee);
	}
	
	@GetMapping("/delemplyee/{id}")
	public ResponseEntity<String> delEmp(@PathVariable Long id) {
		return empService.deleteEmployee(id);
	}
}
