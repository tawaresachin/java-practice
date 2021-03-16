package JavaBasics;

public abstract class test2  			//Abstract class with few incomplete methods
{
	int i=10;
	double d=20.10;
	String str="test2";
	
	public void method1()  				//Complete method
	{
		System.out.println("This is complete method in abstract class");
		System.out.println("I am interger in abstract class: "+i);
		System.out.println("I am double in abstract class: "+d);
		System.out.println("I am abstract class- "+str);
	}
	
	public abstract void method2();   	//Incomplete method

}
