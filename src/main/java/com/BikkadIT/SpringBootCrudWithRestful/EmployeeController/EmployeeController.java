package com.BikkadIT.SpringBootCrudWithRestful.EmployeeController;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.SpringBootCrudWithRestful.model.Employee;

@RestController
public class EmployeeController
{   
	
    public ResponseEntity<Employee> addEmployee(Employee employee)
    {
		return null;
    	
    }
    
    public ResponseEntity<List<Employee>>  getAllEmployee()
    {
		return null;
    	
    }
    
    
}
