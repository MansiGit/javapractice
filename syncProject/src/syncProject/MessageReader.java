package syncProject;

public class MessageReader extends Thread{
	MessageStore ms;

	public MessageReader(MessageStore ms) {
		super();
		this.ms = ms;
	}
	public void run(){
		for(int i=0;i<=10;i++)
		{
			String message= ms.readMessage();
			System.out.println("                         Received " + message);
			try {
				Thread.sleep(3000);//(long)Math.random()*200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
