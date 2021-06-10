package comm.example.app;

import java.util.Scanner;

import comm.example.Employee;
import comm.example.Engineer;
import comm.example.Manager;

public class App {
	
	private static Scanner scanner=new Scanner(System.in);
	private Employee[] employees;
	
	{
		employees=new Employee[5];
	}
	public static void main(String args[])
	{
		App app=new App();
		app.employees[0]=new Employee(10, "John", "Doe", "john@email.com");
		app.employees[1]=new Manager(20, "Marry", "Public", "marry@email.com", "Sales");
		app.employees[2]=new Engineer(30, "Sachin", "Tendulkar", "sachin@email.com", "Mechanical");
		
		//enhanched for loop
		for(Employee employee : app.employees)
		{
			System.out.println(employee);
		}
		
		//standard for loop
		for(int i=0;i<app.employees.length;i++)
		{
			System.out.println(app.employees[i]);
		}
		
	}

}