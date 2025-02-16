package usingexception;

public class Simpprgm {
	public static void main(String[] args) {
		try {
			int a=1;
			int b=0;	
			int c=a/b;
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Handled the Exception");
		}
		}
	}
