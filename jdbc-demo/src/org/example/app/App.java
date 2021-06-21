package org.example.app;

import java.util.List;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;

import org.example.dao.EmployeeNotFoundException;
import org.example.model.Employee;
import org.example.service.EmployeeService;
import org.example.service.EmployeeServiceImpl;


public class App {

	public static void main(String[] args) throws SQLException, NumberFormatException, IOException, EmployeeNotFoundException {
		//mployeeService service=new EmployeeServiceImpl();
		Employee emp;
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));		int choice = 0;
		String firstName, lastName, email = null;
		do {

			System.out.println("1. Create a new employee");
			System.out.println("2. display all available employees");
			System.out.println("3. find employee by id");
			System.out.println("4. update employee by id");
			System.out.println("5. delete employee by id");
			System.out.println("0. exit");
			System.out.print("enter your choice: ");
			choice = Integer.parseInt(bufferedReader.readLine());

			EmployeeService service = null;
			switch (choice) {
			case 1:
				System.out.print("enter first name: ");
				firstName = bufferedReader.readLine();
				firstName = firstName.toUpperCase();
				System.out.print("enter last name: ");
				lastName = bufferedReader.readLine();
				lastName = lastName.toLowerCase();
				System.out.print("enter email: ");
				email = bufferedReader.readLine();
				email = email.toLowerCase();
				List<Employee> employee = service
						.createEmployee(new Employee(new Random().nextInt(100), firstName, lastName, email));
				System.out.println(employee);
				break;
			case 2:
				List<Employee> employees = service.getAllEmployees();
				Iterator<Employee> iterator = employees.iterator();
				while (iterator.hasNext())
					System.out.println(iterator.next());
				break;
			case 3:
				System.out.print("enter id: ");
				Integer id = Integer.parseInt(bufferedReader.readLine());
				List<Employee> list=service.findById(id);
				if(list.isEmpty())
				{
					System.out.println("NO such record found with id: "+id);
				}
				else
				{
					for(Employee e:list)
					{
						System.out.println(e);
					}
				}
				break;
			case 4:
				System.out.print("enter id: ");
				id = Integer.parseInt(bufferedReader.readLine());
				employee=service.updateEmployee(id);
				System.out.println("Updated Employee:\n"+employee);
				break;
			case 5:
				System.out.print("enter id:");
				id = Integer.parseInt(bufferedReader.readLine());
				employee=service.deleteEmployee(id);
				System.out.println("Employee");
			case 0:
				System.out.println("Bye!");
				System.exit(0);
				break;
			default:
				System.out.println("invalid choice");
				break;
			}

		} while (choice != 0);

		

	}

}