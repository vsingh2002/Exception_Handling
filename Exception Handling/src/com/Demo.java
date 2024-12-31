package com;

import java.util.Scanner;

class Demo
{
	/*public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		s.close();
		double div=a/b;
		System.out.println("The division of two number is "+div);
	}*/
	 static  public void  main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Start");
		System.out.println("Enter the first number");
		int a=s.nextInt();
		System.out.println("Enter the second number");
		int b=s.nextInt();
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Do not divide by 0");
		}
		s.close();
		System.out.println("End");
	}

}
