package org.example.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.Resultset;
import java.util.List;

import org.example.dao.EmployeeDao;
import org.example.dao.EmployeeDaoImpl;
import org.example.dao.EmployeeNotFoundException;
import org.example.model.Employee;

@SuppressWarnings("unused")
public abstract class EmployeeServiceImpl implements EmployeeService{
private EmployeeDao employeeDao;
	
	
	public EmployeeServiceImpl() throws SQLException {
		employeeDao=new EmployeeDaoImpl();
	}
	@Override
	public Employee createEmployee(Employee employee) throws SQLException {
		
		return employeeDao.createEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		return employeeDao.getAllEmployees();
	}
	
	public ResultSet searchEmployee(int searchId) throws SQLException {
		
		return employeeDao.searchEmployee(searchId);
	}
	
	public Employee updateEmployee(int id) throws SQLException{
		Employee employee=null;
		try {
			employee=employeeDao.updateEmployee(id);
			
			
	} catch (EmployeeNotFoundException e) {
		
		
	}
	return employee;
	}
	@Override
	public List<Employee> deleteEmployee(int id) throws SQLException, EmployeeNotFoundException {
		 return employeeDao.deleteEmployee(id);
		
		
	}	
}