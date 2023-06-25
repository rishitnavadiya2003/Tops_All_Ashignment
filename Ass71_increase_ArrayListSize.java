package Assignment;

import java.util.ArrayList;

public class Ass71_increase_ArrayListSize
{
	public static void main(String[] args)
	{
		
       ArrayList<String> a1 = new ArrayList<String>(6);
		
		a1.add("Element");
		a1.add("Fish");
		a1.add("Cake");
		a1.add("Dog");
		a1.add("Boll");
		a1.add("Apple");
		

		System.out.println("ArrayList Of 6 Size :- "+a1);
		System.out.println(" ");
		
		a1.ensureCapacity(9);
		a1.add("Cat");
		a1.add("Orange");
		a1.add("Papita");
		System.out.println(" ");
		System.out.println(a1);

		System.out.println(" ");
		System.out.println("Increase The Size ArrayList :- "+a1.size());
		System.out.println(" ");
		System.out.println(a1);
		
	}
}
