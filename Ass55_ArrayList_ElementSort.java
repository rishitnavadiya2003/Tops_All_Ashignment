package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Ass55_ArrayList_ElementSort 
{
	public static void main(String[] args)
	{

		ArrayList a1 = new ArrayList();
		
		a1.add("Element");
		a1.add("Fish");
		a1.add("Cake");
		a1.add("Dog");
		a1.add("Boll");
		a1.add("Apple");
		
		System.out.println("Befor Sorting ArrayList Element :- "+a1);
		Collections.sort(a1);
		System.out.println("After Sorting ArrayList Element :- "+a1);
		
	}
	
}
