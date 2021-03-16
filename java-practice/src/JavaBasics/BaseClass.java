package JavaBasics;
import java.lang.*;

public class BaseClass 					//Main Class--> the class that contains main method

{
	int b=10;							//Instance variable or Non-static variable
	static float c=30.20f;				//Static variable
	final double d=22.22;				//Final-variable
	enum color
	{
		RED,BLUE,BLACK,PURPLE, PINK,WHITE, ORANGE
	}
//	enum objj
//	{
//		concrete,obj,obj1, intfc
//	}
	
	
	BaseClass()							//constructor without argument
	{
		int f=100;
		String s="constructor";
		System.out.println("I am "+s);
		System.out.println("It has integer: "+f);
	}
	
	BaseClass(int L) 					//Constructor with argument
	{
		System.out.println("I am constructor with argument: "+L);
	}
	
	public static void method1(Object obj1)   		//Static method1
	{
		System.out.println("I am static method1");
		Object objj=obj1;
		((BaseClass) objj).method3();	//calling Non-static method inside static method by passing object
	}
	
	public static void method2()   		//Static method2
	{
		System.out.println("I am static method2");
		test1.method3();				//calling static method in static method
		// this.method4();				//calling non-static method within static method is not possible
		System.out.println("Calling Static variable inside Static method: "+c);
		
	}
	
	public void method3()        		//Non-Static method
	{
		int e=40;						//Local variable--> scope limited to parent method
		double f=50.20;
		System.out.println("I am non-static method3");
		//d = e+f;						//Value of final-variable cannot be changes once defined
		
	}
	
	public void method4()				//Non static method
	{
		System.out.println("I am non-static method4");
		this.method3();					//calling non-static method in another non-static method
		test1.method2();				//calling static method in non-static method
		System.out.println("Calling instance-variable inside of non-static method: "+this.b);
		System.out.println("Calling Static-variable inside of non-static method: "+c);
		
	}
	
	static								//Static blocks can be executed even before main method
	{
		System.out.println("I am Static block of Highest priority");
	}
	
	public static void main(String[] args) 	//Main Method
	{
		System.out.println("Test");
		
		
		test1 concrete=new test1(); 		 //constructor to load non-static methods in object
		concrete.method();
		concrete.method1();
		
		
		BaseClass obj=new BaseClass(); 		//constructor to initialize data-members (Zero arguments)
		BaseClass obj1=new BaseClass(20);	//constructor with arguments
		obj1.method3();         			//calling non-static method requires object
		obj1.method4();						
			
		
		method1(obj1);						//calling static method inside the class which it belongs to.
		BaseClass.method2();    			//Alternate or Standard method to call static method
		test1.method2();        			//Calling static method from another class
		
		//test2 abss=new test2();			//Object for abstract class is not possible
		test3 abs=new test3();				//Object can be created only for complete classes
		abs.method1();						//calling complete method in abstract class
		abs.method2();						//calling abstract method completed in extended class
		
		//test4 intf=new test4();			//Object for interface class is not possible
		test5 intfc=new test5();			//Object can be created only for complete classes/Implementation class
		intfc.method_a();
		intfc.method_b();
		intfc.method_c(50);
		test4.method_d();                   //Static method inside of Interface
		
		System.out.println("Instance variable: "+obj.b);
		
		System.out.println("Calling colours using enum: "+color.BLACK);
		
		
		
		
	}

}
