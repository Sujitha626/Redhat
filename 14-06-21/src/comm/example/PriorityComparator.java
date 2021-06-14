package comm.example;

import java.util.Comparator;

public class PriorityComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		// return ((TODO)o1).getPriority().compareTo(((TODO)o2).getPriority());

		if (((Todo) o1).getPriority() == ((Todo) o2).getPriority()) {
			return 0;
		}
		if (((Todo) o1).getPriority() < ((Todo) o2).getPriority()) {
			return 1;
		}
		else
			return -1;
	}

}