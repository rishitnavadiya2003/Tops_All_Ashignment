package Assignment;

class SleepTh extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{	
			try 
			{
				Thread.sleep(2000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("My First Thread is :- "+i);
			
		}
		System.out.println("Thread Completed");
	}
}

public class Ass46_SleepThread {
	
	public static void main(String[] args) {
		
		SleepTh t1 = new SleepTh();
		t1.start();
		

		for(int i=1; i<=5; i++)
		{	
			try 
			{
				Thread.sleep(2000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("My main Thread is :- "+i);
			
		}
		System.out.println("Main Thread Completed");
		
		
		
	}

}
