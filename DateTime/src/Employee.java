import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	private int empID;
	private String name;
	private float salary;
	private Date dob;

	Employee(int id, String name,Date dob, float salary)
	{
		this.empID=id;
		this.name=name;
		this.dob=dob;
		this.salary=salary;
	}
	
	public String toString()
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yy");
		return "EmpID: "+empID+"\n"+"Name: "+name+"\n"+"dob: "+sdf.format(dob)+"\n"+"Salary: "+salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empID != other.empID)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
			return false;
		return true;
	}
}
