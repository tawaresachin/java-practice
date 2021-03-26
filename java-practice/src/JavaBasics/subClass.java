package JavaBasics;

public class subClass extends superClass
{
	int a=100;			  //Instance variable
	static int b=200;     //Global variable
	public void bike()
	{
		System.out.println("Bike");
		System.out.println("Access instance variable: "+this.a);
	}
	public void mobile()
	{
		System.out.println("Mobile");
		System.out.println("Access global variable: "+b);
	}
	public void laptop()
	{
		System.out.println("Laptop");
		System.out.println("Variable a of Superclass is: "+super.a);
		System.out.println("Variable c of Superclass is: "+superClass.c);
		System.out.println("Variable of SupermostClass is: "+super.d);
	}

}
