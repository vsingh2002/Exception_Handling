package exceptionhandling;

import java.util.Scanner;

public class Voting 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		try {
			if(age<18)
			{
				throw new UnderAgeException("You are not eligible");
			}
			else
			{
				System.out.println("You can vote");
			}
		}
		catch(UnderAgeException e)
		{
			e.printStackTrace();
			System.out.println("Exception handled");
		}

	}

}


