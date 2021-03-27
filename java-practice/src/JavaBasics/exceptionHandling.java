package JavaBasics;

import java.io.*;

public class exceptionHandling {
	
	static void fun()
	{
		try
		{
//			String stt=null;
//			stt.length();			//NullPointerException
			int c=1/0;				//ArithmaticException
		}
		catch(ArrayIndexOutOfBoundsException g)
		{
			System.out.println("this is nullpointer exception");
			throw g;  //Rethrow of the exception
		}
	}

	public static void main(String[] args) throws IOException, ArithmeticException
	{
		//System.out.println("Hi");
//		InputStreamReader ip=new InputStreamReader(System.in);
//		System.out.println("Enter Statement");
//		int str=ip.read();
//		System.out.println("Input is:"+str);


	
		try {
//			int a=1/0;
//			System.out.println("Division is:" +a);
			String str=null;
			str.length();
			}
		catch(ArithmeticException e)
		    {
				e.printStackTrace();
							
				//System.out.println("I want to continue");
		    }
		catch (ArrayIndexOutOfBoundsException d)
		{
			d.printStackTrace();
		}
		
		catch(NullPointerException f)
		{
			//f.printStackTrace();
			System.out.println("I am NullPointerException");
		}
		
		finally
		{
			System.out.println("Finally is used to cleanup exception mess");
		}
		
		System.out.println("I am out");
		
		try
		{
			fun();
		}
		catch(NullPointerException g)
		{
			System.out.println("I am main exception1");
		}
		catch(ArithmeticException g)
		{
			System.out.println("I am main exception2");
		}
	}

}
