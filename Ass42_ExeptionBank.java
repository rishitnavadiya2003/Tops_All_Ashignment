package Assignment;

import java.util.Scanner;

class Atm extends Exception
{
	double amount;
	
	public Atm(double need)
	{
		amount = need;
	}
}

class EXBank
{
	double Balance=0,Diposite,Withdraw;
	
	
	public void diposite()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount For Diposite :- ");
		Diposite = sc.nextDouble();
		Balance+=Diposite;
	}
	public void withdraw() throws Atm
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount For Withdrawal :- ");
		Withdraw = sc.nextDouble();
		
		if(Withdraw<=Balance)
		{	
			System.out.println("Withdrawal Money "+Withdraw+"Succesfully");
			
		}
		else
		{
			double need = Withdraw-Balance;
			throw new Atm(need);
		}
		
	}
	
}

public class Ass42_ExeptionBank {
	
	public static void main(String[] args) {
	
		EXBank b = new EXBank();
		b.diposite();
		try 
		{
			b.withdraw();
		}
		catch (Atm e)
		{
			System.out.println("Sorry, insufficient balance, you need more "+e.amount+" Rs. To perform this transaction.  ");
		}
		
		
	}
	
}
