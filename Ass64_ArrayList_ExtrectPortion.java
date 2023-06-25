package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Ass64_ArrayList_ExtrectPortion 
{
	public static void main(String[] args)
	{
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("Rishit");
		a1.add("Yash");
		a1.add("Vishrut");
		a1.add("Tarun");
		a1.add("Divyang");
		a1.add("Nimish");
		a1.add("Kishan");
		a1.add("Kuldeep");
		
		System.out.println("First ArrayList Is :- "+a1);
		
		List<String> a2 = a1.subList(0, 4);
		
		System.out.println(" ");
		
		System.out.println("Second ArrayList Is :- "+a2);
	
	}
}
