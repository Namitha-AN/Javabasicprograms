package usingexception;
import java.util.Scanner;

public class UsingArrayindexecpet {
	public static void main(String[] args) {
		try {
			int rollno[]=new int[3];
				rollno[0]=33;
				rollno[1]=45;
				rollno[2]=44;
				rollno[3]=88;
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("Logic");
		}
	}

}
