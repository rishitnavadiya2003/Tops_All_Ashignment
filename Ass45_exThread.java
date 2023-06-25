package Assignment;

class EXThread extends Thread
{
	public void run()
	{
		System.out.println("This Is Thread");
	
	}
	
}

public class Ass45_exThread {

	public static void main(String[] args) {
		
		EXThread t1 = new EXThread();
		t1.start();
		
	}
	
}
