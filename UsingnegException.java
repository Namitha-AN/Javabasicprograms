package usingexception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UsingnegException {
	public static void main(String[] args) {
		try {
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the size of array");
			int rollno[]=new int[s1.nextInt()];
		}
		catch(NegativeArraySizeException n)
		{
			System.out.println("Please enter the positive integer number only");
		}
		
		catch(InputMismatchException n1)
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("Please enter the positive integer number only starting from 1");
			int rollno[]=new int[s1.nextInt()];
			
		}
		}

}
