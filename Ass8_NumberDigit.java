package Assignment;

import java.util.Scanner;

public class Ass8_NumberDigit {
	
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		int count=0;
		
		System.out.print("Enter Less Than Ten Billion Number :- ");
		long num = sc.nextLong();
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(" "); 
		System.out.print("Number Of Digits In The Number Is :- "+count);
		}
		catch(Exception e)
		{
			System.out.print("Enter Less Than Ten Billion Number");
		}
	}

}
