<<<<<<< HEAD
package Assignment;

abstract class Perent12
{
	
	public abstract void message();
	
	public void msg()
	{
		System.out.println("This Is  Perentclass");	
	}
	
}
class Subclass extends Perent12
{

	public void message()
	{
		System.out.println("This Is First Subclass");	
	}
	
}
class Subclass2 extends Perent12
{

	@Override
	public void message() {
		System.out.println("This Is Second SubClass");
		
	}
}


public class Ass29_Abstract {

	public static void main(String[] args) {
		Subclass s1 = new Subclass();
		Subclass2 s2 = new Subclass2();
		s2.msg();
		s1.message();
		s2.message();
		
	
		
	}
	
}
=======
package Assignment;

abstract class Perent12
{
	
	public abstract void message();
	
	public void msg()
	{
		System.out.println("This Is  Perentclass");	
	}
	
}
class Subclass extends Perent12
{

	public void message()
	{
		System.out.println("This Is First Subclass");	
	}
	
}
class Subclass2 extends Perent12
{

	@Override
	public void message() {
		System.out.println("This Is Second SubClass");
		
	}
}


public class Ass29_Abstract {

	public static void main(String[] args) {
		Subclass s1 = new Subclass();
		Subclass2 s2 = new Subclass2();
		s2.msg();
		s1.message();
		s2.message();
		
	
		
	}
	
}
>>>>>>> 3f07ab97ffe4ef27eebba34da3e949bf92566ed9
