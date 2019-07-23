package threadproject;

public class ThreadMain {
	public static void main(String[] args)
	{
		MessagePrinter m1=new MessagePrinter("HSBC Ltd");
		MessagePrinter m2=new MessagePrinter("Wipro Ltd");
		new Thread(m1).start();
		new Thread(m2).start();
		m1.start();
		m2.start();
		System.out.println(m1);
		System.out.println(m2);
	}
}
