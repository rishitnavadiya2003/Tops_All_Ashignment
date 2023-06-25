package Assignment;

import java.util.HashMap;

public class Ass75_HashMapValueCallectionView 	
{
	public static void main(String[] args)
	{
       HashMap h = new HashMap();
		
		h.put(1, "Rishi");
		h.put(2, "Vishrut");
		h.put(3, "Yash");
		h.put(4, "Tarun");	
		
		System.out.println("Collection View Is :- "+h.values());
	}
}
