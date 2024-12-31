package exceptionhandling;

public class Practice1 {
	public static void main(String[] args) {

		int a = 10, b = 0, c;
		System.out.println("1");
		try {
			System.out.println("2");
			System.out.println("3");
			c = a % b;
			System.out.println("4");

		}

		catch (ArithmeticException e)

		{
			System.out.println("5");
			// System.out.println(e);
			System.out.println("6");
			System.out.println(e.toString());

		}
		System.out.println("7");
	}
}
