package Assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Ass49_ArrayListIterater
{	
	public static void main(String[] args) 
	{
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("Rishit");
		a1.add("Vishrut");
		a1.add("Yash");
		a1.add("Tarun");
		
		Iterator i1 = a1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println("Name is :- "+i1.next());
		}
		
//		System.out.println(" ");
//		
//		for(String s : a1)
//		{
//			System.out.println("The Name is :- "+a1);
//		}
//		
//		System.out.println(" ");
//		
//		for(int i=0;i<a1.size();i++)
//		{
//			System.out.println(a1.get(i));
//		}
//		
//		
		
		
		
	
	
		
	}	
}
