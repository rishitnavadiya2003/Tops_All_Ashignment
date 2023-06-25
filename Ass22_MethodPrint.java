package Assignment;

class Assign
{
	public void method1(int n , char c)
	{
		System.out.println("This Is A First Method");
		System.out.print("The Integer Number Is :- "+n);
		System.out.println(" ");
		System.out.print("The Charecter Is :- "+c);
		System.out.println(" ");
	}
	
	public void method1(char c , int n)
	{
		System.out.println("This Is A Second Method");
		System.out.print("The Charecter Is :- "+c);
		System.out.println(" ");
		System.out.print("The Integer Number Is :- "+n);
		
	}
}

public class Ass22_MethodPrint {

		public static void main(String[] args) {
			
			Assign a1 = new Assign();
			a1.method1(10, 'R');
			a1.method1('R', 10);
		}
	
}
