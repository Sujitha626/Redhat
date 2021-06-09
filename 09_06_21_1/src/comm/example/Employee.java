package comm.example;

public class Employee {
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private double salary;
	public Employee() {
		super();
	}


	public Employee(int employeeId, String firstName, String lastName, String email, double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.salary = salary;
	}


	public Employee(int employeeId2, String firstName2, String lastName2, String email2, int salary2) {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", salary=" + salary + "]";
	}


	@Override
	public boolean equals(Object obj) {
		Employee employee=null;
		if(obj instanceof Employee)
		{
			employee=(Employee)obj;
		}
		if(this.salary==employee.salary)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	

}