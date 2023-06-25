package Assignment;

import java.util.HashSet;
import java.util.Iterator;

public class Ass59_ArrayList_iteraterHashList
{
	
	public static void main(String[] args)
	{
		HashSet<String> a1 = new HashSet<String>();
		
		a1.add("Rishit");
		a1.add("Yash");
		a1.add("Vishrut");
		a1.add("Tarun");
		a1.add("Divyang");
		
		Iterator<String> i1 = a1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}
	
}
