package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Ass57_ArrayList_Suffle
{
	public static void main(String[] args)
	{
		ArrayList<String> a1=new ArrayList<String>();
		
		a1.add("White");
		a1.add("Purple");
		a1.add("Green");
		a1.add("Black");
		a1.add("Red");
		a1.add("Blue");
		
		System.out.println(a1);
		
		Collections.shuffle(a1);
		
		System.out.println(a1);
	}
}
