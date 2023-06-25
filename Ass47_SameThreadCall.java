package Assignment;

class SameTh extends Thread
{
	public void run()
	{
		
			System.out.println("This Is My First Thread ");
		
	}
}

public class Ass47_SameThreadCall {
	
	public static void main(String[] args) {
		
		SameTh t1 = new SameTh();
		t1.start();
		t1.start();

		
	}

}
