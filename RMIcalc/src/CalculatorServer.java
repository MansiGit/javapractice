
import java.rmi.Naming;

public class CalculatorServer {

	public CalculatorServer() {
		try {
			Calculator c = new CalculatorImpl();
			Naming.rebind("rmi://localhost:1099/CalculatorService", c);
			System.out.println("Object is available for service calls");
		} catch (Exception e) {
			System.out.println("Trouble: " + e);
		}
	}

	public static void main(String args[]) {
		new CalculatorServer();
	}
}
