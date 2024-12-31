package exceptionhandling;

public class Practice2 
{
	public static void main(String[] args) {
		int a=100,b=0,c;
		try {
			
			c=a%b;
			System.out.println(c);
		}
		catch(ArithmeticException e){
			e.printStackTrace();

		}
		finally {
			System.out.println("I am in finally block");

		}
		System.out.println("Hello Exception");
	}

}
