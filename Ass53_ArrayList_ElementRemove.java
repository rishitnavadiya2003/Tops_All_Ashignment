package Assignment;

import java.util.ArrayList;

public class Ass53_ArrayList_ElementRemove
{
	public static void main(String[] args)
	{
	
		ArrayList a1 = new ArrayList();
		
		a1.add("The Name Is : ");
		a1.add("Rishi");
		a1.add("Patel");
		a1.add(44);
		a1.add(99);
		a1.add("Navadiya");
		
		System.out.println(a1);
		System.out.println(" ");
		
		a1.remove(3);
		System.out.println("After Remove ArrayList Element :- "+a1);
		
	}
}
