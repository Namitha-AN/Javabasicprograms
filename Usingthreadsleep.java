package usingexception;

public class Usingthreadsleep {
	public static void main(String[] args) {
	try {
	for(int i=0;i<3;i++)
	{
		System.out.println("using Thread");
		Thread.sleep(1000);
	}
	}
	catch(InterruptedException e){
		e.printStackTrace();
	}
	}
}
