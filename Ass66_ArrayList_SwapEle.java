package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Ass66_ArrayList_SwapEle 
{
	
	public static void main(String[] args)
	{
			
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("Rishit");
		a1.add("Vishrut");
		a1.add("Tarun");
		a1.add("Yash");
		a1.add("Divyang");
		
		System.out.println("Before Swaping ArrayList Element");
		System.out.println(a1);
		
		Collections.swap(a1, 2, 3);
		
		System.out.println(" ");
		System.out.println("After Swaping ArrayList Element");
		System.out.println(a1);
		
		
	}
	
}
