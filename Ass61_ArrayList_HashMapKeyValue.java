package Assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ass61_ArrayList_HashMapKeyValue 
{
	public static void main(String[] args)
	{
		HashMap h = new HashMap();
		
		h.put(1, "Rishi");
		h.put(2, "Vishrut");
		h.put(3, "Yash");
		h.put(4, "Tarun");
		
		Set s1 = h.entrySet();
		Iterator i = s1.iterator();
		
		while(i.hasNext())
		{
			Map.Entry m = (Map.Entry) i.next();
			System.out.println("Key Is :-  "+m.getKey());
			System.out.println("Value Is :- "+m.getValue());
		}
			
			
	}	
}
