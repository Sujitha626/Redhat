package org.example.hibernate_crud_demo.service;

import java.util.List;

import org.example.hibernate_crud_demo.model.Employee;

public interface EmployeeService {
	public Employee createEmployee(Employee employee);
	public List<Employee> displayAllEmployee();
	public Employee getemployeeById(Integer id);
	public Employee updateEmployee(Integer id);
	public Employee deleteEmployee(Integer id);

}