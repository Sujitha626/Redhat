package org.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.example.factory.MyConnectionFactory;
import org.example.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private List<Employee> list;
	private MyConnectionFactory myConnectionFactory;
	private Connection connection;
	private static Scanner scanner = new Scanner(System.in);

	public EmployeeDaoImpl() throws SQLException {

		myConnectionFactory = MyConnectionFactory.createFactory();
		connection = myConnectionFactory.getMyConnection();
	}

	@Override
	public Employee createEmployee(Employee employee) throws SQLException {

		PreparedStatement preparedStatement = connection
				.prepareStatement("insert into employee(id,first_name,last_name,email) values(?,?,?,?)");
		preparedStatement.setInt(1, employee.getId());
		preparedStatement.setString(2, employee.getFirstName());
		preparedStatement.setString(3, employee.getLastName());
		preparedStatement.setString(4, employee.getEmail());
		int result = preparedStatement.executeUpdate();
		System.out.println(result + "rows added");
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		list = new ArrayList<Employee>();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from employee");

		while (resultSet.next()) {
			list.add(new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4)));
		}

		return list;
	}

	@Override
	public List<Employee> findById(Integer id) throws SQLException {
		list = new ArrayList<Employee>();
		PreparedStatement preparedStatement = connection.prepareStatement("select * from employee where id=?");
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			list.add(new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4)));

		}

		return list;
	}

	@Override
	public Employee updateEmployee(Integer id) throws SQLException, EmployeeNotFoundException {
		List<Employee> employees = findById(id);
		if (employees.isEmpty()) {
			throw new EmployeeNotFoundException("employee not found with id: " + id);
		}

		System.out.println("enter new first name: ");
		String firstName = scanner.next();
		firstName=firstName.toUpperCase();
		System.out.println("enter new last name: ");
		String lastName = scanner.next();
		lastName=lastName.toUpperCase();
		System.out.println("enter new email: ");
		String email = scanner.next();
		email=email.toLowerCase();

		PreparedStatement preparedStatement = connection
				.prepareStatement("update employee set first_name=?,last_name=?,email=? where id=?");
		preparedStatement.setString(1, firstName);
		preparedStatement.setString(2, lastName);
		preparedStatement.setString(3, email);
		preparedStatement.setInt(4, id);
		preparedStatement.executeUpdate();
		System.out.println("updation sucessfull!");
		Employee employee = employees.get(0);
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setEmail(email);
		return employee;
	}
	public List<Employee> deleteEmployee(int id) throws SQLException, EmployeeNotFoundException
	{
		ResultSet list = searchEmployee(id);
		List<Employee> list1 = new ArrayList<Employee>();
		while(list.next())
		{
			list1.add(new Employee(list.getInt(1),list.getString(2),list.getString(3),list.getString(4)));
		
		}
		if(list1.isEmpty())
		{
			throw new EmployeeNotFoundException("Employee not found with id"+id);
		}
		PreparedStatement preparedStatement=connection.prepareStatement("delete from employee where employee_id=?");
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
		System.out.println("Deleted sucessfull!");
		
		return list1;
	}

	public ResultSet searchEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}