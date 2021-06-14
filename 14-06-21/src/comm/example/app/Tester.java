package comm.example.app;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

import comm.example.Desccomparator;
import comm.example.PriorityComparator;
import comm.example.Todo;

@SuppressWarnings("unused")
public class Tester {

	public static void main(String[] args) {
		Desccomparator desccomparator=new Desccomparator();
		PriorityComparator priorityComparator=new PriorityComparator();
		Set<Todo> set=new TreeSet<Todo>(priorityComparator);
		
		set.add(new Todo(UUID.randomUUID().toString(),"compile",3));
		set.add(new Todo(UUID.randomUUID().toString(),"Analysys",1));
		set.add(new Todo(UUID.randomUUID().toString(), "ByteCodeVerifications", 1));
		for(Todo t:set)
		{
			System.out.println(t);
		}
		//CRUD(Create-Remove-Update-Display)
		Set<Object> s1=new TreeSet<>();
		s1.size();
		s1.add(10);
		
		s1.add(2);
		System.out.println(s1);

	}

}