package bank;

public class BankTest {
/*@override
int hashCode()
{
return 0;
}*/
public static void main(String args[])
{
	account a=new account(1,"Mansi",500.25f);
	a.display();
	BankTest bankTest=new BankTest();
	//bankTest.
	try {
		a.depositMoney(1400);
	} catch (ArrayException e) {
		e.showReason();
	}
	a.display();
	
	try {
		a.withdaw(200);
	} catch (ArrayException e) {
		e.showReason();
	}
	a.display();

	try {
		a.withdaw(2000);
	} catch (ArrayException e) {
		e.showReason();
	}
	a.display();
}

}
