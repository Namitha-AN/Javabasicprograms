package usingexception;

public class Usingthrows {
		public static void main(String[] args) throws ArrayIndexOutOfBoundsException,NullPointerException
		{
			if(1==1)
			{
			throw new ArrayIndexOutOfBoundsException("size is less");
			}
			else
			{
			throw new NullPointerException("Cell is empty");
		}

	}

}
