package bank;

public class account {

	private int accNo;
	private String name;
	private float balance;
	
	public account(int accNo, String name, float balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	void depositMoney(int amt) throws ArrayException
	{
		if (amt>=100)
			this.balance+=amt;
		else
			throw new ArrayException("You deposit less than 100");
	}
	
	void withdaw(int amt) throws ArrayException
	{
		if(balance>amt)
			this.balance-=amt;
		else
			throw new ArrayException("You cant overdraw");//System.out.println("You cant overdraw");
	}
	
	void display()
	{
		System.out.println("\nAccount Number: "+this.accNo);
		System.out.println("Name: "+this.name);
		System.out.println("Balance: "+this.balance);
	}
	
}
