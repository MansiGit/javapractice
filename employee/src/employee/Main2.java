package employee;

public class Main2 {
	public static void main(String args[])
	{
		if (args.length!=3)
		{
			System.out.println("Invalid number of args");
			System.exit(0);
		}
		int eid=Integer.parseInt(args[0]);
		String name = args[1];
		float sal= Float.valueOf(args[2]);
		
		EmployeeData e= new EmployeeData(eid,name,sal);
		System.out.println(e.toString());
		
	}
}
