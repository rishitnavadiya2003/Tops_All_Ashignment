package Assignment;

class PrintNumber
{
	
	public void printn(int a)
	{
		System.out.print("The Value Of Integer A Is :- "+a);
		System.out.println(" ");
	}
	
	public void printn(short a)
	{
		System.out.print("The Value Of Short A Is :- "+a);
		System.out.println(" ");
	}
	
	
	public void printn(long a)
	{
		System.out.print("The Value Of Long A Is :- "+a);
		System.out.println(" ");
		System.out.println(" ");
	}
	
	public void printn(byte a)
	{
		System.out.print("The Value Of Byte A Is :- "+a);
		System.out.println(" ");
		System.out.println(" ");
	}
	
	public void printn(float a)
	{
		System.out.print("The Value Of Float A Is :- "+a);
		System.out.println(" ");
		
		
	}
	
	public void printn(double a)
	{
		System.out.print("The Value Of Double A Is :- "+a);
		System.out.println(" ");
		System.out.println(" ");
	}
	
	public void printn(String a)
	{
		System.out.print("The Value Of String A Is :- "+a);
		System.out.println(" ");
		System.out.println(" ");
	}
	
	public void printn(char a)
	{
		System.out.print("The Value Of Cherecter A Is :- "+a);
		System.out.println(" ");
		System.out.println(" ");
	}
	
	public void printn(boolean a)
	{
		System.out.print("The Value Of Boolean A Is :- "+a);
		System.out.println(" ");
		System.out.println(" ");
	}
	
	
	
}

public class Ass21_DataTypePrinting {

		public static void main(String[] args) {
			
			PrintNumber p1 = new PrintNumber();
			
			p1.printn(1);//byte
			p1.printn(10);//short
			p1.printn(1000);//int
			p1.printn(1000000000);//long
			
			p1.printn(100.5545f);//float
			p1.printn(1999.999567891);//double
			
			p1.printn('R');//char
			p1.printn("Rishi Patel");//string
			
			p1.printn(true);//boolean
			
		}
}
