<<<<<<< HEAD
package Assignment;

import java.util.Scanner;

public class Ass5_SumAvg {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int sum = 0 ;
		float avg = 0f;
		
		for(int i=1; i<=5; i++)
		{	
			System.out.print("Enter "+i+" Number :");
			int num = sc.nextInt();
			sum=sum+num;
		}
		System.out.println("The Sum Of Five Number Is :- "+sum);
		
		avg=(float)sum/5;
		
		System.out.print("Average Of Given Number Is : "+avg);
		
	}	
	
}
=======
package Assignment;

import java.util.Scanner;

public class Ass5_SumAvg {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int sum = 0 ;
		float avg = 0f;
		
		for(int i=1; i<=5; i++)
		{	
			System.out.print("Enter "+i+" Number :");
			int num = sc.nextInt();
			sum=sum+num;
		}
		System.out.println("The Sum Of Five Number Is :- "+sum);
		
		avg=(float)sum/5;
		
		System.out.print("Average Of Given Number Is : "+avg);
		
	}	
	
}
>>>>>>> 3f07ab97ffe4ef27eebba34da3e949bf92566ed9
