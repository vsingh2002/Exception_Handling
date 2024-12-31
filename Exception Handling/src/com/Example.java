package com;

public class Example 
{
	public static void main(String[] args) {
		String s="Vishal";//s=null;
		if(s!=null)//Avoiding an exception
		{
			System.out.println("Length of "+s+"  is "  + s.length());
			
		}
		System.out.println("--------");
		String x="Java";//x=null;
		try//Handling an exception
		{
			System.out.println(x.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
