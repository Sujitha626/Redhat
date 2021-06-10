package comm.example;

import java.util.Scanner;

public class App1 {
	
	/*private char[] s;
	{
		s=new char[26];
	}
	
	public char[] createArray()
	{
		for(int i=0;i<s.length;i++)
		{
			s[i]=(char)('A'+i);
		}
		return s;
	}*/
	
	private static Scanner scanner=new Scanner(System.in); 

	public static void main(String[] args) {
		/*
		 * //orphan object char[] str=new App().createArray(); //Enhanced for loop
		 * for(char s:str) { System.out.println(s); }
		 * System.out.println("======================"); //for loop for(int
		 * i=0;i<str.length;i++) { System.out.println(str[i]); }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		int choice=0;
		MyStack myStack=new MyStack();
		System.out.print("Enter the length of the Stack:  ");
		int length=scanner.nextInt();
		myStack.createStack(length);
		do {
			System.out.println("\n1. Push.");
			System.out.println("2. Pop.");
			System.out.println("3. Search Item.");
			System.out.println("4. Display the Stack");
			System.out.println("0. Exit");
			System.out.print("enter your choice");
			choice=scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("provide an integer value to push.");
				int value=scanner.nextInt();
				myStack.push(value);
				break;
			case 2:
				myStack.pop();
				break;
			case 3:
				System.out.print("Enter item to search: ");
				value=scanner.nextInt();
				myStack.searchStack(value);
				break;
			case 4:
				int[] result=myStack.displayStack();
				for(int i:result)
				{
					System.out.print(i+" ");
				}
				break;
			case 0:
				System.out.println("exiting from the system. Bye .........!");
				System.exit(0);

			default:
				System.out.println("invalid choice");
				break;
			}
			
		} while (choice !=0);
		
		
		
		
		
		
		

	}

}