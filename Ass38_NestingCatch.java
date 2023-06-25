<<<<<<< HEAD
package Assignment;

public class Ass38_NestingCatch {

	public static void main(String[] args) {
		
		try
		{
			int a=10;
			int b=0;
			int c=a/b;
			
			int ab[] =new int[5];
			ab[5]=6;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		
		
	}
	
}
=======
package Assignment;

public class Ass38_NestingCatch {

	public static void main(String[] args) {
		
		try
		{
			int a=10;
			int b=0;
			int c=a/b;
			
			int ab[] =new int[5];
			ab[5]=6;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		
		
	}
	
}
>>>>>>> 3f07ab97ffe4ef27eebba34da3e949bf92566ed9
