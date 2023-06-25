package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Ass56_ArrayList_Copy
{
	public static void main(String[] args) 
	{

		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("Rishi");
		a1.add("Patel");
		a1.add("Vishrut");
		a1.add("Rupera");
		
	ArrayList<String> a2 = new ArrayList<String>();
		
		a2.add("Rishit");
		a2.add("Navadiya");
		a2.add("Yash");
		a2.add("Kanzariya");
		
		System.out.println("ArrayList 1 :- "+a1);
		System.out.println(" ");
		System.out.println("ArrayList 2 :- "+a2);
		System.out.println(" ");
		
		Collections.copy(a2, a1);
		System.out.println("ArrayList 2 :- "+a2);
	}
}
