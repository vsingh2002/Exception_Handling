package com;

import java.io.*;

public class CheckedExample
{
	public static void main(String[] args) {
		//Unhandled exception type FileNotFoundException
		try {
			FileReader f=new FileReader("vishal.txt");	
		}
		catch(Exception a)
		{
			System.out.println("File not found");
		}
		// Unhandled Exception type InterruptedException
		for(int i=1;i<=20;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception b)
			{
				System.out.println("Handled");
			}


		}

	}

}
