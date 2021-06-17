package comm.example.race;

public class ThreadTest {

	public static void main(String[] args) {
		new PrintStringThread("Hello", "There");
		new PrintStringThread("How Are", "You?");
		new PrintStringThread("Thank You", "Very Much");

	}

}