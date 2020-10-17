package com.smc.SocialMedia.security.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.smc.SocialMedia.models.Employee;
import com.smc.SocialMedia.repository.EmplyeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmplyeeRepository empRepository;
	
	 public List<Employee> getAllEmployees(){
		 List<Employee> employees = new ArrayList<>();
		 empRepository.findAll().forEach(employees::add);
		return employees;
	 }
	 
	 public Employee addEmployee(Employee employee) {
		 return empRepository.save(employee) ;
		
		 
	 }
	 
	 public ResponseEntity<String> deleteEmployee(Long id) {
		   empRepository.deleteById(id);
		   return new ResponseEntity<>(HttpStatus.OK);
		 
	 }
}
