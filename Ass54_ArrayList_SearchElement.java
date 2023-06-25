package Assignment;

import java.util.ArrayList;

public class Ass54_ArrayList_SearchElement
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
		
		if(a1.contains("Rishi"))
		{
			System.out.println("Element Is Found In ArrayList");
		}
		else
		{
			System.out.println("Element Is Not Found In ArrayList");
		}
		
	}
	
}
