package customexception;

public class InvalidBalanceException extends Exception
{

	private String message;

	InvalidBalanceException(String message)
	{
		this.message=message;
	}
	@Override
	
	public String getMessage()
	{
		return message;
	}
}
