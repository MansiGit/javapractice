import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class DateMain {

	public static void main(String[] args) {
		int empID = 0;
		String name;
		float salary;
		Date d;
		Scanner sc = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		d = c.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		Employee e = new Employee(100, "abcd", new GregorianCalendar(1987, 7, 21).getTime(), 5000);
		System.out.println(e);
		System.out.println("Enter empID :");
		empID = sc.nextInt();
		System.out.println("Enter Name: ");
		name = sc.next();
		System.out.println("Enter Salary");
		salary = sc.nextFloat();
		System.out.println("Enter Date of Birth(dd/MM/yyyy)");
		String dob = sc.next();
		try {
			d=new SimpleDateFormat("dd/MM/yyyy").parse(dob);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}  
		e = new Employee(empID, name,d, salary);

		System.out.println(e);

	}

}
