package Assignment;

class Member
{
	int Deta_Member = 1
	   ,Age = 20
	   ,Salary = 100000;
	long Phone_Number = 820044337; 
	
	String Name = "Vishrut",
		   Address ="Near Khandipol Wadhwan";
	
	public void printSalary()
	{
		System.out.println("The Data Member Is :- "+Deta_Member);
		System.out.println("The Name Of Data Member Is :- "+Name);
		System.out.println("The Age Of Data Member Is :- "+Age);
		System.out.println("The Salary Of Data Member Is :- "+Salary);
		System.out.println("The Phone Number Of Data Member Is :- "+Phone_Number);
		System.out.println("The Address Of  Data Member Is :- "+Address);
	}
}


public class Ass25_Member {

	public static void main(String[] args) {
		
		Member m = new Member();
		m.printSalary();
				
	}
}
