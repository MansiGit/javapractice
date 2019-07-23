package inheritance;

class employee extends person {
	int empID, sal;

	employee() {
		super();
		empID = 0;
		sal = 0;
	}
 
	public int getEmpID() {
		return empID;
	}

	public employee(String name, String address, int empID, int sal) {
		super(name, address);
		this.empID = empID;
		this.sal = sal;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	void display()
	{
		System.out.println("name : "+name+" address: "+address);
		System.out.println("empID : "+empID+" sal: "+sal);
	}
}
