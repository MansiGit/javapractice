package inheritance;

class student extends person {
	int stdID, marks;

	student() {
		super();
		stdID = 0;
		marks = 0;
	}

	public int getStdID() {
		return stdID;
	}

	public void setStdID(int stdID) {
		this.stdID = stdID;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	void display()
	{
		System.out.println("name : "+name+" address: "+address);
		System.out.println("stdID : "+stdID+" marks: "+marks);
	}
}