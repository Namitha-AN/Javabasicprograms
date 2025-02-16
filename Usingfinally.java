package usingexception;

public class Usingfinally {
	public static void main(String[] args) {
		try
		{
			int a=1/0;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled the exception");
		}
		finally {
			System.out.println("Closing the Connection with database");
		}
	}
}
