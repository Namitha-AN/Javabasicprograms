package usingexception;

public class Usingtrycatchfinally {
		public static void main(String[] args) {
			try
			{
				int a=1/1;
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


