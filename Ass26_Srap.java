<<<<<<< HEAD
package Assignment;

class Rectangle
{
	
	int length,breadth;
	
	public Rectangle(int l, int b) 
	{
		length = l;
		breadth = b;
	}
	
	public void area()
	{
		System.out.println("The Area Of Rectangle is :-"+(length*breadth));
	}
	public void perimeter()
	{
		System.out.println("The Perimeter Of Rectangle Is :- "+2*(length+breadth));	
	}
	
}
class SquerA1 extends Rectangle
{
	int s;
	public SquerA1(int l) {
		super(l,l);
		s=l;
	}
	

	public void sarea()
	{
		System.out.println("The Area Of Squer Is :- "+(s*s));
	}
	
	public void sperimiter()
	{
		System.out.println("The Perimeter Of Squer Is :- "+(4*s));
	}

	
	
}

public class Ass26_Srap {

	public static void main(String[] args) {
		
		SquerA1 s = new SquerA1(20);
		s.area();
		s.perimeter();
		s.sarea();
		s.sperimiter();
		
		
	}
	
}
=======
package Assignment;

class Rectangle
{
	
	int length,breadth;
	
	public Rectangle(int l, int b) 
	{
		length = l;
		breadth = b;
	}
	
	public void area()
	{
		System.out.println("The Area Of Rectangle is :-"+(length*breadth));
	}
	public void perimeter()
	{
		System.out.println("The Perimeter Of Rectangle Is :- "+2*(length+breadth));	
	}
	
}
class SquerA1 extends Rectangle
{
	int s;
	public SquerA1(int l) {
		super(l,l);
		s=l;
	}
	

	public void sarea()
	{
		System.out.println("The Area Of Squer Is :- "+(s*s));
	}
	
	public void sperimiter()
	{
		System.out.println("The Perimeter Of Squer Is :- "+(4*s));
	}

	
	
}

public class Ass26_Srap {

	public static void main(String[] args) {
		
		SquerA1 s = new SquerA1(20);
		s.area();
		s.perimeter();
		s.sarea();
		s.sperimiter();
		
		
	}
	
}
>>>>>>> 3f07ab97ffe4ef27eebba34da3e949bf92566ed9
