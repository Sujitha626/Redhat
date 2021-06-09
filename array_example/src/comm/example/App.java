package comm.example;

public class App {
	
	private char[] s;
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
	}

	public static void main(String[] args) {
		//orphan object
		char[] str=new App().createArray();
		//Enhanced for loop
		for(char s:str)
		{
			System.out.println(s);
		}
		System.out.println("======================");
		//for loop
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}

	}

}