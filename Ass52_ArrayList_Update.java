package Assignment;

import java.util.ArrayList;

public class Ass52_ArrayList_Update
{
	public static void main(String[] args)
	{
		

		ArrayList a1 = new ArrayList();
		
		a1.add("Rishi");
		a1.add("Patel");
		a1.add("The Name Is : ");
		a1.add(44);
		a1.add(99);
		a1.add("Navadiya");
		
		System.out.println("Befor Update ArrayList :- "+a1);
		System.out.println(" ");
		
		a1.set(0, "Rishit");
		a1.set(1, "Navadiya");
		a1.set(5, "Patel");
		
		System.out.println("After Update ArrayList :- "+a1);
		
	}
}
