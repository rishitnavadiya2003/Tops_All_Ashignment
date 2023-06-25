package Assignment;

import java.util.Scanner;

class Vote
{
	public void voteAge(int age)
	{
		if(age > 18)
		{
			System.out.println("Welcome To Vote");
		}
		else
		{
			throw new ArithmeticException("Invelid Age :- "+age);
		}
	}
}

public class Ass41_ExeptionVote {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Age :- ");
		int age = sc.nextInt();
		Vote v = new Vote();
		
		try 
		{
			v.voteAge(age);
		} 
		catch(Exception e)
		{	
			System.out.println(e);
			System.out.println("*** Better Luck Next Time ***");
		}
		
		
	}
}
