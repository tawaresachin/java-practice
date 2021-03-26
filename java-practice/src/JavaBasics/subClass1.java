package JavaBasics;

public class subClass1 extends superClass
{
	public void tv()
	{
		System.out.println("TV");
		
	}
	public void cycle()
	{
		System.out.println("Cycle");
	}
	
	public void m1()			//method m1 without argument
	{
		System.out.println("I am method m1");
	}
	public void m1(int e)		//method m1 without argument
	{
		System.out.println("I am method m1 with argument: "+e);
	}
	
	public void m2()		//subclass method m2 without argument
	{
		System.out.println("I am method m2 from subClass");
	}

}
