package data.hsbc;

import java.io.Serializable;

public class Employee implements Comparable<Employee>,Serializable{
	private static final long serialVersionUID = 1L;
	
	private int empID;
	private String name;
	private float salary;
	Employee(int id, String name, float salary)
	{
		this.empID=id;
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee e1) {
		if(this.empID < e1.empID)
			return -1;
		if(this.empID > e1.empID)
			return 1;
		
		return 0;
	}
}
