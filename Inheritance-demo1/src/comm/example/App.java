package comm.example;
//this is my main class
import comm.example.model.Employee;
import comm.example.model.Engineer;
import comm.example.model.Manager;

public class App {

	public static void main(String[] args) {
		App app=new App();
		Employee employee=new Manager("Suji", "Doe", "suji@email.com", 10000, "Sales");
		System.out.println(employee.getDetails());
		System.out.println(app.calculateTax(employee));
		employee=new Engineer("Reddy", "Public", "reddy@email.com", 19000, "Mechanical");
		System.out.println(employee.getDetails());
		System.out.println(app.calculateTax(employee));
	}
	
	
	public double calculateTax(Employee employee)
	{
		double tax=0;
		if(employee instanceof Manager)
		{
			tax= 12.0;
		}
		if(employee instanceof Engineer)
		{
			tax=11.9;
		}
		return tax;
	}

}