package customexception;

public class Voting 
{
	public static void main(String[] args) 
	{
		int age=19;
		try {
			if(age<18)
			{
				throw new UnderAgeException();
			}
			else
			{
				System.out.println("Can vote");
			}
		}
		catch(UnderAgeException e)
		{
			e.printStackTrace();
		}
	}

}
