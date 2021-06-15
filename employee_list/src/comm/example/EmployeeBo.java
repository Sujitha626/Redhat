package comm.example;

import java.util.Set;

public class EmployeeBo {

	@SuppressWarnings("unused")
	private static void printEmployees(Set<Employee> employees) {
		for (Employee employee : employees) {
			employee.toString();
		}

	}

}
