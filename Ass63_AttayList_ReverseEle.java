package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Ass63_AttayList_ReverseEle 
{
	
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		
		a1.add("Zibra");
		a1.add("Elephant");
		a1.add("Tiger");
		a1.add("Bear");
		a1.add("Dear");
		a1.add("Alligator");
		
		System.out.println("Before Reverse ArrayList Element :- "+a1);
		 Collections.reverse(a1);
		 System.out.println(" ");
		System.out.println("After Reverse ArrayList Element :- "+a1);
	}
	
}
