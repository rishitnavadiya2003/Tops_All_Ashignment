package Assignment;

import java.util.HashSet;

public class Ass74_HashSet_RetainBothSet
{
	
	public static void main(String[] args)
	{
		HashSet<String> a1 = new HashSet<String>();
		
		a1.add("Vishrut");
		a1.add("Yash");
		a1.add("Rishit");
		a1.add("Tarun");
		a1.add("Divyang");
			
		System.out.println("The HashSet Element Are :- "+a1);
		System.out.println(" ");
	
		HashSet<String> a2 = new HashSet<String>();
		
		a2.add("Ghanshyam");
		a2.add("Yash");
		a2.add("Rishit");
		a2.add("Harsh");
		a2.add("Dhruv");
		
		System.out.println("The HashSet Element Are :- "+a2);
		System.out.println(" ");

	    a1.retainAll(a2);
	
	System.out.println("The HashSet Contain Only This Element :- "+a1);
	
	}
}
