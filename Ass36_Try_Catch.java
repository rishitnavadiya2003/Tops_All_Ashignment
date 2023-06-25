package Assignment;

public class Ass36_Try_Catch {
	
	public static void main(String[] args) {
		
		try
		{
			int a = 10;
			int b=0;
			System.out.println("Division Of Two Number Is "+(a/b));
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		
	}
	
}
