package bank;

public class ArrayException extends Exception{
	private String message;

	public ArrayException(String message) {
		super();
		this.message = message;
	}
	 
	public void showReason()
	{
		System.out.println(message);
	}
}
