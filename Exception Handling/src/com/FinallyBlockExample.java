package com;

public class FinallyBlockExample
{
	public static void main(String[] args) {
		System.out.println("Start");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled");
		}
		finally
		{
			System.out.println("Vishal Handled Exception inside finally block");
		}
		System.out.println("End");

	}

}
