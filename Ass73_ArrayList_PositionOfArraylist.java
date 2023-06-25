package Assignment;

import java.util.ArrayList;

public class Ass73_ArrayList_PositionOfArraylist
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
		System.out.println(" ");
		
		for(String e :a1 )
			System.out.println(e);
	}
	
}
