package Assignment;

import java.util.Scanner;

public class Ass14_PositionIndex {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter String :- ");
			String s = sc.nextLine();
		
			System.out.println(" ");
			
			System.out.print("Enter Index :- ");
			int n = sc.nextInt();
			
			System.out.println(" ");
			
			System.out.print(s.charAt(n));
			
		}
	
}

