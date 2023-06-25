package Assignment;

import java.util.Scanner;

class Stdmark
{
	public void setMark(int m)
	{
		if(m>=0 && m<=100)
		{
			if(m>=91 && m<=100)
			{
				System.out.println("Your Grade Is :- AA");
			}
			else if(m>=81 && m<=90)
			{
				System.out.println("Your Grade Is :- AB");
			}
			else if(m>=71 && m<=80)
			{
				System.out.println("Your Grade Is :- BB");
			}
			else if(m>=61 && m<=70)
			{
				System.out.println("Your Grade Is :- BC");
			}
			else if(m>=51 && m<=60)
			{
				System.out.println("Your Grade Is :- CD");
			}
			else if(m>=40 && m<=50)
			{
				System.out.println("Your Grade Is :- DD");
			}
			else
			{
				System.out.println("You Are Fail");
			}
		}
		else
		{
			System.out.println("Plese Entered Currect Marks");
		}
	}
	
}

public class Ass34_GreadMark {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Mark :- ");
		int m = sc.nextInt();
		
		Stdmark m1 = new Stdmark();
		m1.setMark(m);
		
		
	}
	
}
