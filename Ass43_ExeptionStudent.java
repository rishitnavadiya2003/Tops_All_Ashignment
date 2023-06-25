package Assignment;

class ageex extends Exception
{
	int age;
	public ageex(int age)
	{
		this.age=age;
		
	}
}
class nameex extends Exception
{
	String name;
	public nameex(String name) 
	{
		this.name=name;
	}
}

class Student
{
	int rno,age;
	String name,course;
	
	public Student(int rno, int age, String name, String course) 
	{
		this.rno=rno;
		this.age=age;
		this.name=name;
		this.course=course;
		try {
			check();
		} 
		catch (ageex e)
		{
			System.out.println(e.age+"AgeNotWithinRangeException");
		} 
		catch (nameex e) 
		{
			System.out.println(e.name+"NameNotValidException");
		}
	}
	
	public void check() throws ageex, nameex
	{
		if(age>=15 && age<=21)
		{	
			boolean as= name.matches("^[a-zA-z]+$");
			
			if(as)
			{
				System.out.println("YOur RollNo Is :- "+rno);
				System.out.println("YOur Name Is :- "+name);
				System.out.println("YOur Age Is :- "+age);
				System.out.println("YOur Course Is :- "+course);
		
			}
			else
			{
				throw new nameex(name);
			}
		}
		else
		{
			throw new ageex(age);
		}
	}
}

public class Ass43_ExeptionStudent {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1,25,"Rishit","Bsc.IT");
		
	}

}
