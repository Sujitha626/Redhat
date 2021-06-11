package comm.example;

public class Manager extends Employee{
	private String departmentName;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int id, String name,String departmentName) {
		super(id, name);
		this.departmentName=departmentName;
		
	}

	@Override
	public String toString() {
		return "Manager [departmentName=" + departmentName + ", toString()=" + super.toString() + "]";
	}
	
	

}