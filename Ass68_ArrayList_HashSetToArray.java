package Assignment;

import java.util.HashSet;

public class Ass68_ArrayList_HashSetToArray
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
		
		String a2[] =  new String[a1.size()];
		
		a1.toArray(a2);
		
		System.out.println("Array Elements Are :- ");
		System.out.println(" ");
		
		for(String a : a2)
		{
			System.out.println(a);
		}
		
	}
}
