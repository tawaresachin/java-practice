package JavaBasics;

public class superClass extends supermostClass
{
	int a=20;				//SuperClass variable
	static int c=300;
	public void gold()
	{
		System.out.println("Gold");
	}
	public void house()
	{
		System.out.println("House");
	}
	public void car()
	{
		System.out.println("Car");
	}

	public void m2()		//super class method m2 without argument
	{
		System.out.println("I am method m2 fromSuperClass");
	}
}
