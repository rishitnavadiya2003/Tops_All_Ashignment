<<<<<<< HEAD
package Assignment;

class ShapeAB
{
	public void displayS()
	{
		System.out.println("This Is Shape ");
	}
}
class CircleAB extends ShapeAB
{
	public void displayc()
	{
		System.out.println("This Is Circle");
	}
}
class RectengleAB extends ShapeAB
{
	public void displayR()
	{
		System.out.println("This Is Rectengle");
	}
}
class Square extends RectengleAB
{
	public void displayS()
	{
		System.out.println("Squer Is Rectengle");
	}
}


public class Ass35_Squer_Rect_Circle {

	
	public static void main(String[] args) {
		
		Square s1 = new Square();
		s1.displayS();
		s1.displayR();
	}
	
}
=======
package Assignment;

class ShapeAB
{
	public void displayS()
	{
		System.out.println("This Is Shape ");
	}
}
class CircleAB extends ShapeAB
{
	public void displayc()
	{
		System.out.println("This Is Circle");
	}
}
class RectengleAB extends ShapeAB
{
	public void displayR()
	{
		System.out.println("This Is Rectengle");
	}
}
class Square extends RectengleAB
{
	public void displayS()
	{
		System.out.println("Squer Is Rectengle");
	}
}


public class Ass35_Squer_Rect_Circle {

	
	public static void main(String[] args) {
		
		Square s1 = new Square();
		s1.displayS();
		s1.displayR();
	}
	
}
>>>>>>> 3f07ab97ffe4ef27eebba34da3e949bf92566ed9
