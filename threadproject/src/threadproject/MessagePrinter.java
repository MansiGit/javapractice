package threadproject;

public class MessagePrinter extends Thread{
	private String message;
	
	public MessagePrinter(String message)
	{
		super();
		this.message=message;
	}
	
	public void run()
	{
		for(int i=0;i<50;i++){
			System.out.println("Message "+i+" "+message);
		}
	}
}

