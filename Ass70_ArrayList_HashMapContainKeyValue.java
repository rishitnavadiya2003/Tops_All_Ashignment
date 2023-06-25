package Assignment;

import java.util.HashMap;

public class Ass70_ArrayList_HashMapContainKeyValue 
{
	public static void main(String[] args) 
	{
		HashMap h = new HashMap();
		
		h.put(1, "Rishi");
		h.put(2, "Vishrut");
		h.put(3, "Yash");
		h.put(4, "Tarun");
		
		System.out.println("The HashMap Is :- "+h);
		
		System.out.println(" ");
		
		System.out.println("Is Key 2 Is Present? " + h.containsKey(2));
		
		System.out.println(" ");
		
		System.out.println("Is Key 3 Is Present? " + h.containsKey(3));
	

		System.out.println(" ");
		
		System.out.println("Is Key 6 Is Present? " + h.containsKey(6));
	}
}
