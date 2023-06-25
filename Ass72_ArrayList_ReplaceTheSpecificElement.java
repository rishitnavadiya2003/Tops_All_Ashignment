package Assignment;

import java.util.ArrayList;

public class Ass72_ArrayList_ReplaceTheSpecificElement
{
	
	public static void main(String[] args)
	{
		
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("Rishit");
		a1.add("Vishrut");
		a1.add("Tarun");
		a1.add("Yash");
		a1.add("Divyang");
		
		System.out.println("The ArrayList Is :- "+a1);
		
		a1.set(2, "Yash");
		a1.set(3, "Tarun");
		
		System.out.println(" ");
		System.out.println("Replace ArrayList Is :- "+a1);
		
		System.out.println(" ");
		
		for(String e : a1)
			System.out.println(e);
		
	}	
	
}
