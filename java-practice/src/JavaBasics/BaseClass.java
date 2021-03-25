package JavaBasics;
import java.lang.*;
import java.util.*;
import java.util.Map.Entry;

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
		int[] Arr1= {2,4,1,3};					//fashion-1
		char Arr2[]= {'c','e','a','b','d'};		//fashion-2
		String[] Arr3=new String[10];			//creating array object
		Arr3[0]= "this";
		Arr3[1]="is";
		Arr3[2]="Java";
		Arr3[3]="class";
		
		String[] Arr4= {"This","is","Testing","Class"};
		int[] Arr5= {2,4,1,3};
		int[] Arr6= {2,4,1,3};
		
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
		
		//Display array using toString method
		
		String ss1=Arrays.toString(Arr1);
		System.out.println("Display array Arr1 as a whole: "+ss1);
		
		//Sorting the array
		Arrays.sort(Arr1);
		String ss2=Arrays.toString(Arr1);
		System.out.println("Sorted Array Arr1 is: "+ ss2);
		Arrays.parallelSort(Arr2);
		String ss3=Arrays.toString(Arr2);
		System.out.println("Sorted Array Arr2 is: "+ ss3);
		
		//Searching element of array (Binary Search)
		int BS = Arrays.binarySearch(Arr2, 'e');
		System.out.println("Location of element 'e' on array Arr2 is: "+BS);
	
		Arrays.sort(Arr4);
		System.out.println(Arrays.toString(Arr4));
		int BS1=Arrays.binarySearch(Arr4, "is");
		System.out.println("Location of string 'Java' on array Arr4 is: "+BS1);
		
		//Comparing two arrays
		Boolean flagg=Arrays.equals(Arr5, Arr6);
		System.out.println("Comparing Arr5 & Arr6: "+flagg);
		
		//Two domentional array
		int[][] Arr7= {{1,2,3},
				{4,5,6}};
		int [][] Arr8=new int[2][2];
		 Arr8[0][0]=8;
		 Arr8[0][1]=9;
		 Arr8[1][0]=10;
		 Arr8[1][1]=11;
		 
		 for(int i = 0;i<2;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
				 System.out.println("Element of Array: "+Arr7[i][j]);
			 }
		 }
		 
		//1. List - a) Array-List 
		ArrayList al=new ArrayList();

		al.add(1);		//Insert values in arraylist
		al.add('c');
		al.add("Test");
		al.add(1.5);
		al.add(true);
		al.add(null);
		al.add(' ');
		
		System.out.println("Array List: "+al.toString());
		al.add(0,2025);	  		//Insert values in array list- non-synchronised behaviour
		System.out.println("Array List: "+al.toString());
		
		al.set(0, "Java");		//Update value at certain position
		System.out.println("Array List: "+al.toString());
		
		al.remove(3);			//Delete value at certain position
		System.out.println("Array List: "+al.toString());
		
		Collections.reverse(al);
		System.out.println("Array List: "+al.toString());
		
		ListIterator it = al.listIterator();   //used for retrival & deletion
		
		while(it.hasNext())
		{
			System.out.println("Array List Element: "+it.next());
		}
	
		Object val1=al.get(1);
		System.out.println("Object retrived has value: "+val1);
		
		al.clear();					//Clear alll objects in arraylist
		System.out.println("Array List: "+al.toString());
		
		//1. List - b) Vector
		Vector v=new Vector();
		System.out.println("Capacity of vector: "+v.capacity());
		System.out.println("if Vector is empty?: "+v.isEmpty());
		
		
		v.add(3);
		v.add('g');
		v.add("Manual");
		v.add(1.25);
		v.add(false);
		v.add(null);
		v.add(' ');
		
		System.out.println("Vector has values: "+v);
		v.add(2,"Automation");
		System.out.println("Vector has values: "+v);
		v.set(2, 'h');
		System.out.println("Vector has values: "+v);
		v.remove(2);
		System.out.println("Vector has values: "+v);
		
		Iterator it1 = v.iterator();
		while(it1.hasNext())
		{
			System.out.println("values inside the vector: "+it1.next());
		}
		
		Collections.reverse(v);
		System.out.println("Reversed vector is: "+v);
		System.out.println("Size of vector: "+v.size());
		
		Object val2=v.get(2);
		System.out.println("Object retrived has value: "+val2);
		v.clear();
		System.out.println("Vector has values: "+v);
		
		//1. List - c) LinkedList
		LinkedList lnl=new LinkedList();
		
		lnl.add("Test");
		lnl.add(20.21);
		lnl.add('x');
		lnl.add(null);
		lnl.add(" ");
		lnl.add(true);
		System.out.println("Linked List is: "+lnl);
		
		lnl.add(2, 43);
		System.out.println("Linked List is: "+lnl);
		
		lnl.set(2, 50);
		System.out.println("Linked List is: "+lnl);
		
		lnl.remove(2);
		System.out.println("Linked List is: "+lnl);
		
		System.out.println("The size of linked list is: "+lnl.size());
		
		Iterator it2 = lnl.iterator();
		while(it2.hasNext())
		{
			System.out.println("The Element of LinkedList: "+it2.next());
		}
		
		Collections.reverse(lnl);
		System.out.println("Linked List is: "+lnl);
		
		Object val3 = lnl.get(3);
		System.out.println("Object retrived is: "+val3.toString());
		
		lnl.clear();
		System.out.println("Linked List is: "+lnl);
		
		//1. List - d) Stack
		Stack stk=new Stack();
		stk.add(5);
		stk.add('F');
		stk.add("Automation");
		stk.add(true);
		stk.add(null);
		stk.add(' ');
		
		System.out.println("Contents on the stack are: "+stk);
		
		stk.add(2,'@');
		System.out.println("Contents on the stack are: "+stk);
		
		stk.set(2, '%');
		System.out.println("Contents on the stack are: "+stk);
		
		stk.remove(2);
		System.out.println("Contents on the stack are: "+stk);
		
		Iterator it4 = stk.iterator();
		while(it4.hasNext())
		{
			System.out.println("Element of stack: "+it4.next());
		}
		
		stk.push("push");
		System.out.println("Contents on the stack are: "+stk);
		
		stk.pop();				//LIFO behaviour
		stk.pop();
		System.out.println("Contents on the stack are: "+stk);
		
		Object xx = stk.peek();
		System.out.println("Contents on the stack are: "+xx);
		
		stk.clear();
		System.out.println("Contents on the stack are: "+stk);
		
		//2. Set - a) HashSet
		
		HashSet hs=new HashSet();
		
		hs.add(20);
		hs.add("String");
		hs.add('K');
		hs.add(true);
		hs.add(true);
		hs.add(null);
		hs.add(' ');
		
		System.out.println("Elements in HashSet are: "+hs);
		
		int size1=hs.size();
		System.out.println("Size of HashSet is: "+size1);
		
		hs.remove(' ');
		System.out.println("Elements in HashSet are: "+hs);
		
		Iterator it5 = hs.iterator();
		while(it5.hasNext())
		{
			System.out.println("Elements od HashSet are: "+it5.next());
		}
		
		
		hs.clear();
		System.out.println("Elements in HashSet are: "+hs);
		
		//2. Set - b) LinkedHashSet
		LinkedHashSet lhs=new LinkedHashSet();
		
		lhs.add(7);
		lhs.add("Lion");
		lhs.add('L');
		lhs.add(true);
		lhs.add(false);
		lhs.add(null);
		lhs.add(null);
		
		System.out.println("Elements in LinkedHashSet are: "+lhs);
		
		int size2=lhs.size();
		System.out.println("Size of LinkedHashSet is: "+size2);
		
		lhs.remove('L');
		System.out.println("Elements in LinkedHashSet are: "+lhs);
		
		Iterator it6 = lhs.iterator();
		while(it6.hasNext())
		{
			System.out.println("Element of LinkedHashSet are: "+it6.next());
		}
		
		lhs.clear();
		System.out.println("Elements in LinkedHashSet are: "+lhs);
		
		
		//2. Set - c) TreeSet
		
		TreeSet<Integer> ts=new TreeSet<Integer>();  //different datatypes are not allowed
		ts.add(9);
		ts.add(100);
		ts.add(20);
		ts.add(50);
//		ts.add(null);				//null is not allowed


		System.out.println("Elements of TreeSet are: "+ts);
		
		int size4=ts.size();
		System.out.println("Size of treeset is: "+size4);
		
		ts.remove(100);
		System.out.println("Elements of TreeSet are: "+ts);
		
		Iterator<Integer> it7 = ts.iterator();
		
		while(it7.hasNext())
		{
			System.out.println("Element in treeset are: "+it7.next());
		}
		
		ts.clear();
		System.out.println("Elements of TreeSet are: "+ts);
		
		//3. Queue (Implementation class is LinkedList)
		
		Queue qu=new LinkedList();
		qu.add("string");
		qu.add('c');
		qu.add(44);
		qu.add(null);
		qu.add(true);
		
		System.out.println("Elements in queue are: "+qu);
		
		int size5=qu.size();
		System.out.println("Size of queue: "+size5);
		
		qu.remove(null);
		System.out.println("Elements in queue are: "+qu);
		
		Iterator it8 = qu.iterator();
		while(it8.hasNext())
		{
			System.out.println("Elements of queue are: "+it8.next());
		}
		
		Object yy = qu.peek();
		System.out.println("Object returned using peek method is: "+yy);
		
		qu.poll();
		System.out.println("Elements in queue are: "+qu);
		
		// 4. Maps- a) HashMap
		
		HashMap<String, Integer> hm=new HashMap();
		HashMap<String, Integer> hm1=new HashMap();
		
		hm.put("a", 10);
		hm.put("b", 20);
		hm.put("c", 30);
		hm.put("d", null);
		hm.put(null, 40);
		hm.put("e", null);
		hm.put("f", null);
		
		System.out.println("Hash map contains: "+hm);
		
		Integer val6 = hm.get("c");
		System.out.println("Value at certain v is: "+val6);
		
		Boolean flag15=hm.containsKey("30");
		Boolean flag16=hm.containsValue(null);
		System.out.println("If hashmap contains key 30? "+flag15);
		System.out.println("If hashmap contains value null? "+flag16);
		
		int size11=hm.size();
		System.out.println("Size of HashMap is: "+size11);
		
		hm.remove("d");
		System.out.println("Hash map contains: "+hm);
		
		Set<String> st = hm.keySet();
		System.out.println("Set of Keys are: "+st);
		
		Collection<Integer> val7 = hm.values();
		System.out.println("Values in hashmap are: "+val7);
		
		Set<Entry<String, Integer>> st1 = hm.entrySet();
		System.out.println("Hashmap converted into Set: "+st1);
		
		String stt="Hi Hello Hi Hello Hi";
		String[] stt1=stt.split(" "); // [Hi, Hello, Hi, Hello, Hi]
		
		for(String x:stt1)
		{
			if(!hm1.containsKey(x))				//Hi =3
			{
				hm1.put(x, 1);					//Hello=2
			}
			else
			{
				hm1.put(x, hm1.get(x)+1);
			}
		}
		
		System.out.println("Hash map for given string is: "+hm1);
		
		// 4. Maps- a) Hashtable
		
		Hashtable<String, Integer> ht=new Hashtable();
		
		ht.put("a", 1);
		ht.put("b", 2);
		//ht.put("c", null);
		//ht.put(null, 3);
		ht.put("d", 4);
		
		System.out.println("Hashtable view: "+ht);
		
		Integer value33=ht.get("d");
		System.out.println("Value at key 'd' is: "+value33);
		
		Boolean flag17=ht.containsKey("b");
		Boolean flag18=ht.containsValue(1);
		System.out.println("If hashtable contians key 'b' ? "+flag17);
		System.out.println("If hashtable contians value '1' ? "+flag18);
		
		ht.remove("a");
		System.out.println("Hashtable view: "+ht);
		
		Integer intt=new Integer(2);
		String val44 = intt.toString();
		int val55 = intt.parseInt("123");
		
		// OOPS- Inheritance- 1. Single Level Inheritance
		subClass child=new subClass();
		child.bike();			//own
		child.mobile();			//own
		child.laptop();			//own
		child.gold();			//parent's
		child.car();			//parent's
		child.house();			//parent's
		
		//OOPS- Inheritance- 2. Multi Level Inheritance
		superClass parent=new superClass();
		parent.gold();
		parent.car();
		parent.house();
		parent.farm();
		parent.business();
		
		child.bike();			//own
		child.mobile();			//own
		child.laptop();			//own
		child.gold();			//parent's
		child.car();			//parent's
		child.house();			//parent's
		child.farm();			//grandparent's
		child.business();		//grandparent's
		
		//OOPS- Inheritance- 4. Hybrid Inheritance
		subClass1 child1=new subClass1();
		child1.tv();			//own
		child1.cycle();			//own
		child1.gold();			//parent's
		child1.house();			//parent's
		child1.car();			//parent's
		child1.business();		//parent's
		child1.farm();			//parent's
	}

}
