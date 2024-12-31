package customexception;

import java.util.Scanner;

public class ATM 
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the amount to be withdrawn");
		int amount=s.nextInt();
		int balance=5000;
		if(amount<=balance)
		{
			System.out.println("Amount withdrawn successfully!");
		}
		else
		{
			try
			{
				throw new InvalidBalanceException("Insufficient balance");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		}
	}

}
