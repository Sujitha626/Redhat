package comm.example.demo;

import java.io.Serializable;

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

//marker pattern
public class Employee implements Serializable{
	
	private String employeeId;
	private String employeeName;
	private String employeeAddress;
	

}