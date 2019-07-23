package serializing;

import java.io.Serializable;

public class Teacher implements Serializable{
	private static final long serialVersionUID = 42L;
	private int teacherID;
	private String name;
	private float salary;
	public Teacher(int teacherID, String name, float salary) {
		super();
		this.teacherID = teacherID;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Teacher [teacherID= " + teacherID + ", name=" + name + ", salary=" + salary +"]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		
		if (teacherID != other.teacherID)
			return false;
		return true;
	}
	
	
}
