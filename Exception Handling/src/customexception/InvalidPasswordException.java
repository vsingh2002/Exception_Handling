package customexception;

public class InvalidPasswordException extends RuntimeException
{
//if class extends RunTimeException ->Unchecked
//if class extends Exception ->Checked
	
	private String message;
	
	InvalidPasswordException(String Message)
	{
		this.message=message;
	}
	@Override
	public String getMessage()
	{
		return message;
	}
}
