package collectionsproject;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		ArrayList<Employee> empData = new ArrayList<Employee>();
		int empID = 0;
		String name;
		float salary;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter empID :");
			empID = sc.nextInt();
			if (empID != -1) {
				System.out.println("ENter Name: ");
				name = sc.next();
				System.out.println("ENter Salary");
				salary = sc.nextFloat();
				Employee e = new Employee(empID, name, salary);
				empData.add(e);
			} else
				break;
		}
		for (Object d : empData) {
			if (d instanceof Employee) {
				Employee x = (Employee) d;
				System.out.println(x.getName());
			}
		}
		sc.close();
	}

}
