  
  
package comm.example;
import comm.example.model.Todo;

public class App {

	public static void main(String[] args) {
		App app=new App();
	/*	Employee employee=new Manager("John", "Doe", "john@email.com", 10000, "Sales");
		System.out.println(employee.getDetails());
		System.out.println(app.calculateTax(employee));
		employee=new Engineer("Marry", "Public", "marry@email.com", 19000, "Mechanical");
		System.out.println(employee.getDetails());
		System.out.println(app.calculateTax(employee));*/
		Todo todo=new Todo();
		todo.createTodo("Compile", false);
		System.out.println(todo.toString());
		Todo todo1=new Todo();
		todo1.createTodo("Compile", false);
		System.out.println(todo1.toString());
		System.out.println(todo==todo1);
		System.out.println(todo.equals(todo1));
	}
	
/*	//calculating tax
	//polyporphic arguent
	public double calculateTax(Employee employee)
	{
		double tax=0;
		if(employee instanceof Manager)
		{
			Manager manager=(Manager)employee;
			tax= (12.0/100)*manager.getSalary();
		}
		if(employee instanceof Engineer)
		{
			Engineer engineer=(Engineer)employee;
			
			tax=(11.9/100)*engineer.getSalary();
		}
		return tax;*/
	}

