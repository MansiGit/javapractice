package employee;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeTest {
	public static void main(String srgs[]) throws NumberFormatException, IOException {

		EmployeeData a = getEmpData();
		EmployeeData a2 = getEmpData();
		if (a == null || a2 == null)
			System.out.println("One object is null");
		if (a.equals(a2))
			System.out.println("Same Data");
		else
			System.out.println("not equal");
		System.out.println(a.toString());
	}
	
	static EmployeeData getEmpData() {
		EmployeeData a = null;
		try {
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter your name: ");
			String name=sc.nextLine();
			//String name = br.readLine();
			System.out.println("Enter your EmpID: ");
			int empID=sc.nextInt();
			//int empID = Integer.parseInt(br.readLine());
			System.out.println("Enter your salary: ");
			float salary= Float.valueOf(sc.nextFloat());
			//float salary = Float.valueOf(br.readLine());

			a = new EmployeeData(empID, name, salary);
		} 
		catch(InputMismatchException e)
		{
			return null;
		}
		return a;
	}
	
}
/**
 * EmployeeData a=new EmployeeData(200);
 * a.display(); 
 * EmployeeData b=new EmployeeData(100,"Mansi"); 
 * b.display();
 * EmployeeData c=new EmployeeData(100,"Mansi");//(300,"Mansi",15000); 
 * c.display(); 
 * if (b==c)
 * System.out.println("equal"); 
 * a.setName("Julie"); 
 * a.display();
 * 
 * c.setSalary(15000); c.display();
 * 
 * c.setSalary(8000); c.display();
 */
