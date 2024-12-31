package com;

public class UncheckedExample 
{
	public static void main(String[] args) {
		//Not handling immediately -> ArrayIndexOutOfBoundsException
		int[]a= {10,20,30};
		System.out.println(a[99]);
		//Not handling immediately ->ArithmeticException
		System.out.println(10/0);
	}

}
