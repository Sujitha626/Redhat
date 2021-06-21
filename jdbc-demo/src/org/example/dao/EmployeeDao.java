package org.example.dao;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;

import org.example.model.Employee;

public interface EmployeeDao {
	
	public Employee createEmployee(Employee employee) throws SQLException;
	
	public List<Employee> getAllEmployees()throws SQLException;
	
	public List<Employee> findById(Integer id)throws SQLException;
	
	public Employee updateEmployee(Integer id)throws SQLException,EmployeeNotFoundException;

	public ResultSet searchEmployee(int searchId);

	public List<Employee> deleteEmployee(int id) throws SQLException, EmployeeNotFoundException;

}