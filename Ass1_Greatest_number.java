package Assignment;

import java.util.Scanner;

public class Ass1_Greatest_number {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter Number 1 :- ");
			int no1 = sc.nextInt();
			

			System.out.print("Enter Number 2 :- ");
			int no2 = sc.nextInt();
			

			System.out.print("Enter Number 3 :- ");
			int no3 = sc.nextInt();
			
			System.out.println(" ");
			
			if(no1 > no2 && no1 > no3)
			{
				System.out.print("The Meximum Number Is No1 :- "+no1);
			}
			else if(no2 > no1 && no2 > no3)
			{
				System.out.print("The Meximum Number Is No2 :- "+no2);
			}
			else
			{
				System.out.print("The Meximum Number Is No3 :- "+no3);
			}
			
			
		}
	
}
