package Assignment;

import java.util.ArrayList;

public class Ass65_ArrayList_Compare 
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
		
		ArrayList<String> a2 = new ArrayList<String>();
	
		a2.add("Tarun");
		a2.add("Divyang");
		a2.add("Nimish");
		a2.add("Kishan");
		a2.add("Rishit");
		a2.add("Yash");
		a2.add("Vishrut");
		
		ArrayList<String> a3 = new ArrayList<String>();
		
		 for (String e : a1)
             a3.add(a2.contains(e) ? "Yes" : "No");
          System.out.println(a3);
		
	}
}
