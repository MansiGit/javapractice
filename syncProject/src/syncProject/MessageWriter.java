package syncProject;

public class MessageWriter extends Thread{
	MessageStore ms;

	public MessageWriter(MessageStore ms) {
		super();
		this.ms = ms;
	}
	public void run(){
		for (int i=1;i<=10;i++)
		{
			ms.storeMessage("Message : "+i);
			System.out.println("Stored Message "+i);
			try {
				Thread.sleep(2000);//(long)Math.random()*200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
