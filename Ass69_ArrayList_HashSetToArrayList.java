package Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Ass69_ArrayList_HashSetToArrayList
{
	public static void main(String[] args)
	{
       HashSet<String> a1 = new HashSet<String>();
		
		a1.add("Vishrut");
		a1.add("Yash");
		a1.add("Rishit");
		a1.add("Tarun");
		a1.add("Divyang");
		
		System.out.println("HashSet Is :- "+a1);
		System.out.println(" ");
		
		List<String> a = new ArrayList<String>(a1);
		
		System.out.println("Converted ArrayList Is :- "+a);
	}
	
}
