package com;

public class MainClass 
{
	public static void main(String[] args) 
	{
		try {
			System.out.println(10/0);

		}
		catch(ArithmeticException a)
		{
			System.out.println("Invalid denominator");
		}
		catch(ArrayIndexOutOfBoundsException ar)
		{
			System.out.println("Invalid ");
		}
		catch(Exception e)
		{
			System.out.println("Exception handle by Super class");
		}
		


	}

}
