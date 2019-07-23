package collectionsproject;

public class Employee {
	private int empID;
	private String name;
	private float salary;

	Employee(int id)
	{
		this.empID=id;
		name= "Unknown";
		salary=10000;
	}
	public int getEmpID() {
		return empID;
	}
	public String getName() {
		return name;
	}
	public float getSalary() {
		return salary;
	}
	Employee(int id, String name)
	{
		this.empID=id;
		this.name= name;
		salary=10000;
	}
	Employee(int id, String name, float salary)
	{
		this.empID=id;
		this.name=name;
		this.salary=salary;
	}
	
	void display() {
		System.out.println("\nEmp Id: " + empID);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}
	void setName(String name)
	{
		if(name!=null)
			this.name=name;
	}
	void setSalary(float salary)
	{
		if(this.salary<salary)
			this.salary=salary;
	}
	public String toString()
	{
		return "EmpID: "+empID+"\n"+"Name: "+name+"\n"+"Salary: "+salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empID;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(salary);
		return result;
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
