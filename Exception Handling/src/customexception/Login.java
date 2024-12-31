package customexception;

import java.util.Scanner;

public class Login
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the password");
		int password=s.nextInt();
		s.close();
		if(password==123)
		{
			System.out.println("Login successfully!");
		}
		else
		{
			try
			{
				throw new InvalidPasswordException("Kindly entered the right password");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		}
	}
}


