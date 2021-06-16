package comm.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Student implements Comparable<Object>{
	
	private String studentId;
	private String firstName;
	private String lastName;
	private String email;
	private double gpa;
	
	
	@Override
	public int compareTo(Object o) {
		if(this.gpa>((Student)o).gpa)
			return -1;
		if(this.gpa<((Student)o).gpa)
			return 1;
		else
			return 0;
	}
	
	

}