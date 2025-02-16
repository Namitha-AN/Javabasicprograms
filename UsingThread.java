package usingexception;

public class UsingThread {
	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<3;i++)
		{
			System.out.println("Thread");
			Thread.sleep(1000);
		}
	}
}
