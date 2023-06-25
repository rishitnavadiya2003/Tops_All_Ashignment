package Assignment;

import java.util.ArrayList;

public class Ass67_AarrayList_JoinTwoArray 
{
	
	public static void main(String[] args)
	{
		
			ArrayList<String> a1 = new ArrayList<String>();
		
			a1.add("Rishi");
			a1.add("Patel");
			a1.add("Vishrut");
			a1.add("Rupera");
		
			System.out.println("First ArrayList Is :- "+a1);
			System.out.println(" ");
			
			ArrayList<String> a2 = new ArrayList<String>();
			
			a2.add("Tarun");
			a2.add("Paramar");
			a2.add("Yash");
			a2.add("Kanzariya");
			
			System.out.println("Second ArrayList Is :- "+a2);	
			System.out.println(" ");
			
			ArrayList<String> a3 = new ArrayList<String>();
			
			a3.addAll(a1);
			a3.addAll(a2);
			
			System.out.println("Join Array List Is :- "+a3);
	}
	
		
}
