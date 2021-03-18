package JavaBasics;
import java.lang.*;
import java.util.*;

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
		
		String S1="Batch1";				//Stores in Constant Pool Area- Duplicates not allowed
		String S2="BATCH1";				//Stores in Constant Pool Area- Duplicates not allowed
		String S3=new String("Batch1");	//Stores in Constant Pool Area-Duplicates are allowed
		String S4=new String("Batch1"); //Stores in Constant Pool Area-Duplicates are allowed
		String S5=" Lec-XX";
		if(S1==S2)
		{
			System.out.println("Both Strings S1 & S2 points to same memory");
		}
		
		if(S3==S4)
		{
			System.out.println("Both Strings S1 & S2 points to same memory");
		}
		else
		{
			System.out.println("Both Strings S1 & S2 points to different locations");
		}
		
		//Operations on String using String Class in Java.lang package
		//1. To Evaluate lenght of String
		int length=S1.length();
		System.out.println("Lenght of the String S1: "+length);
		
		//2. To Check equal strings
		boolean equal1 = S1.equals(S2);
		boolean equal2=S3.equals(S4);
		boolean equal3=S1.equalsIgnoreCase(S2);
		System.out.println("If S1 & S2 are equal?: "+equal1);
		System.out.println("If S3 & S4 are equal?: "+equal2);
		System.out.println("If S1 & S2 are equal ignoring case?: "+equal3);
		
		//3. To Concat two strings
		String S6=S1+S5;
		System.out.println("Concat two strings using '+' operator: "+S6);
		String S7=S1.concat(S5);
		System.out.println("Concat two strings using 'concat' method: "+S7);
		
		//4. To Split the string
		String S8="This is Testing Class";
		String[] StrArr = S8.split(" ");
		String[] ChrArr = S8.split("");
		String[] ChrArr2=S8.split("n");
		char[] ChrArr1 = S8.toCharArray();
		
		for(String st:StrArr)  //For-Each loop
		{
			System.out.println(st);
		}
		
		for(String ch:ChrArr)
		{
			System.out.println(ch);
		}
		for(String ch1:ChrArr2)
		{
			System.out.println(ch1);
		}
		for(char ch2:ChrArr1)
		{
			System.out.println(ch2);
		}

		//5. Returning specific character at given index
		
		char chh = S8.charAt(5);
		System.out.println("Character at 5th position is: "+chh);
		
		//6. To Address position of character in string
		int ind=S8.indexOf('C');
		int ind1=S8.indexOf('i');    //this returns first index
		int ind2=S8.lastIndexOf('i'); //this returns last index
		System.out.println("Position of C: "+ind);
		System.out.println("Position of i: "+ind1);
		System.out.println("Position of last i"+ind2);
		
		//7. Checking sub-part of given string
		String S9="Testing";
		boolean flag = S8.contains(S9);
		boolean flag1 = S8.contains(S1);
		System.out.println("Whether S9 is part of parent String S8?: "+flag);
		System.out.println("Whether S1 is part of parent String S8?: "+flag1);
		
		//8. To change the case of String
		String S10=S8.toUpperCase();		//UpperCase
		String S11=S8.toLowerCase();		//LowerCase
		System.out.println("S8 in Upper case: "+S10);
		System.out.println("S8 in Lower case: "+S11);
		
		//10. Checking the Start & End of String
		boolean flag3 = S8.startsWith("This is");
		boolean flag4 = S8.startsWith("i am");
		boolean flag5 = S8.endsWith("class");
		boolean flag6 = S8.endsWith("Class");
		System.out.println("Whether S8 is starting with 'This is'?: "+flag3);
		System.out.println("Whether S8 is starting with 'i am'?: "+flag4);
		System.out.println("Whether S8 is ending with 'class'?: "+flag5);
		System.out.println("Whether S8 is ending with 'Class'?: "+flag6);
		
		//11. Replacing part of string 
		String S12 = S8.replace("Testing", "Java");
		System.out.println("Replaced String S8 is: "+S12);
		
		//12.To check if string is empty & blank
		String S13="";
		String S14=" ";
		boolean flag7=S8.isEmpty();
		boolean flag8=S13.isEmpty();
		boolean flag9=S13.isBlank();
		boolean flag10=S14.isEmpty();		//Empty=No character 
		boolean flag11=S14.isBlank();		//Blank=only spaces
		System.out.println("whether string S8 is Empty?: "+flag7);
		System.out.println("whether string S13 is Empty?: "+flag8);
		System.out.println("whether string S13 is blank?: "+flag9);
		System.out.println("whether string S14 is Empty?: "+flag10);
		System.out.println("whether string S14 is blank?: "+flag11);
		
		//13. To extract the subString within given range if indices
		String S15=S8.substring(5, 15);
		System.out.println("Substring of String S18 is: "+S15);
		
		//Defining one-dimensional (1D) array
		int[] Arr1= {1,2,3,4};					//fashion-1
		char Arr2[]= {'a','b','c','d','e'};		//fashion-2
		String[] Arr3=new String[10];			//creating array object
		Arr3[0]= "this";
		Arr3[1]="is";
		Arr3[2]="Java";
		Arr3[3]="class";
		
		//to calculate lenght of array
		int l1=Arr1.length;
		int l2=Arr2.length;
		int l3=Arr3.length;
		System.out.println("Lenght of Arr1: "+l1);
		System.out.println("Lenght of Arr2: "+l2);
		System.out.println("Lenght of Arr3: "+l3);
		
		//Display array elements using for loop
		for(int i=0;i<l1;i++)
		{
			System.out.println("Element "+i+" of array Arr1: "+Arr1[i]);
		}
		for(int i=0;i<l2;i++)
		{
			System.out.println("Element "+i+" of array Arr2: "+Arr2[i]);
		}
		for(int i=0;i<l3;i++)
		{
			System.out.println("Element "+i+" of array Arr3: "+Arr3[i]);
		}
		
		//Display array elements using for-each loop
		for(int x:Arr1)
		{
			System.out.println("Array1 has value: "+x);
		}
		for(String x:Arr3)
		{
			System.out.println("Array3 has value: "+x);
		}
		
	}

}
