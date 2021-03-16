package JavaBasics;

public interface test4   			//Special type of class with 100% incomplete non-static methods
{
	int x=2;						//Static & Final
	String str1="Interface";		//Static & Final
	
	public abstract void method_a();
	
	public abstract void method_b();
	
	public void method_c(int a);
	
	public static void method_d()
	{ 
		System.out.println("I am static method inside of interface");
	}
	
}
