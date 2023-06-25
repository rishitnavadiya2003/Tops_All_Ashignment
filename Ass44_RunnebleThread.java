package Assignment;

class RunThread implements Runnable
{

	
	public void run()
	{
		System.out.println("This is Runnable Thread");	
		
	}
	
}

public class Ass44_RunnebleThread {

public static void main(String[] args) {
	
	
	RunThread r = new RunThread();
	Thread th1 = new Thread(r);
	th1.start();
}
}
