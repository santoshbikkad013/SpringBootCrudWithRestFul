package com.BikkadIT.SpringBootCrudWithRestful.dao;

<<<<<<< HEAD
import java.util.List;

import com.BikkadIT.SpringBootCrudWithRestful.model.Employee;

public class DaoImpl implements DaoI{

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}
=======
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DaoImpl implements DaoI{


>>>>>>> d7c43c474b5faff2344beddbad534096e5d71955

}
