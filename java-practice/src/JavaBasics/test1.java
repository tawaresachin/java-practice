package JavaBasics;

public class test1   		// Concrete class --> all complete methods
{
	int i=10;
	double j=20;
	String s="Testing Class";
	
	public void method()   //Complete method
	{
	  System.out.println("Complete method1");
	}
	
	public void method1()   //Complete method
	{
		System.out.println("Complete method2");
		this.method();
	}
	
	public static void method2()
	{
		System.out.println("I am static method from class test1");
	}
	
	public static void method3()
	{
		System.out.println("to be called in static method of another class");
	}
}
