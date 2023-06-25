package Assignment;

import java.util.Scanner;

public class Ass37_Arithmethic {

		public static void main(String[] args) {
			
			try
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Number 1 :- ");
				int n1 = sc.nextInt();
				
				System.out.println("Enter Number 2 :- ");
				int n2 = sc.nextInt();
				
				System.out.println("The Sum Of Two Number Is :- "+(n1/n2));
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			
			}
			
		}
	
}
