package JavaBasics;

public class BaseClass 		//Main Class

{
	
	BaseClass()		//constructor without argument
	{
		int f=100;
		String s="constructor";
		System.out.println("I am "+s);
		System.out.println("It has integer: "+f);
	}
	
	BaseClass(int L) //Constructor with argument
	{
		System.out.println("I am constructor with argument: "+L);
	}
	
	public static void method1()   //Static method1
	{
		System.out.println("I am static method1");
	}
	
	public static void method2()   //Static method2
	{
		System.out.println("I am static method2");
		method1();
		test1.method3();
		
	}
	
	public void method3()        //Non-Static method
	{
		System.out.println("I am non-static method3");
	}
	
	public void method4()
	{
		System.out.println("I am non-static method4");
		this.method3();
		test1.method2();
		
	}
	
	
	
	public static void main(String[] args) //Main Method
	{
		System.out.println("Test");
		
		
		test1 concrete=new test1();  //constructor to load non-static methods in object
		concrete.method();
		concrete.method1();
		
		BaseClass obj=new BaseClass(); 		//constructor to initialize data-members (Zero arguments)
		BaseClass obj1=new BaseClass(20);	//constructor with arguments
		
		method1();				//calling static method inside the class which it belongs to.
		BaseClass.method2();    //Alternate or Standard method to call static method
		test1.method2();        //Calling static method from another class
		
		obj1.method3();         //calling non-static method requires object
		obj1.method4();
		
	}

}
