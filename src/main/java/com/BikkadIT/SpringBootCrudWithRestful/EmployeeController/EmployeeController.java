package com.BikkadIT.SpringBootCrudWithRestful.EmployeeController;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.SpringBootCrudWithRestful.model.Employee;

@RestController
public class EmployeeController
{   
	@PostMapping(value = "/addEmployee",produces = "application/json",consumes = "application/json")
    public ResponseEntity<Employee> addEmployee(Employee employee)
    {
		return null;
    	
    }
	@GetMapping(value = "/addEmployee",produces = "application/json",consumes = "application/json")
    public ResponseEntity<List<Employee>>  getAllEmployee()
    {
		return null;
    	
    }
    
    
}
