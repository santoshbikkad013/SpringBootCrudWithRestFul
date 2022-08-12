package com.BikkadIT.SpringBootCrudWithRestful.service;

import java.util.List;

import com.BikkadIT.SpringBootCrudWithRestful.model.Employee;

public interface ServiceI {

	public Employee addEmployee(Employee employee);
	
	public List<Employee> getAllEmployee();
}
