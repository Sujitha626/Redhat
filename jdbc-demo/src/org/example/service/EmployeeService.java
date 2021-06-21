package org.example.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.example.dao.EmployeeNotFoundException;
import org.example.model.Employee;

public interface EmployeeService {
	public Employee createEmployee(Employee employee) throws SQLException;
	
	public List<Employee> getAllEmployees()throws SQLException;
	

	public ResultSet searchEmployee(int searchId) throws SQLException;

	public Employee updateEmployee(int id) throws SQLException, EmployeeNotFoundException;
	public List<Employee> deleteEmployee(int id) throws SQLException, EmployeeNotFoundException;

	public List<Employee> findById(Integer id);
}

