<<<<<<< HEAD
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
=======
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
>>>>>>> 3f07ab97ffe4ef27eebba34da3e949bf92566ed9
