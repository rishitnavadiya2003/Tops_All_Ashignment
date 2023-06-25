package Assignment;

import java.util.ArrayList;

public class Ass51_ArrayList_SpecificIndex 
{
	
	public static void main(String[] args)
	{
		
		ArrayList a1 = new ArrayList();
		
		a1.add("Rishi");
		a1.add("Patel");
		a1.add("The Name Is : ");
		a1.add(44);
		a1.add(99);
		a1.add(8936);
		a1.add(2550);
		a1.add(9245);
		a1.add(6789);
		a1.add("Navadiya");
		
		System.out.println(a1);
		System.out.println(" ");
		
		System.out.print("[1]"+a1.get(2)+" ");
		System.out.print("[2]"+a1.get(0)+" ");
		System.out.print("[3]"+a1.get(1)+" ");
		
		
	}
	
}
