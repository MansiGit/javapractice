package serializing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Student implements Serializable{
	private String name;
	private int studID;
	private Teacher teacher;
	private float marks;
	public Student(String name, int studID, Teacher t, int marks) {
		super();
		this.name = name;
		this.studID = studID;
		this.teacher = t;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", studID=" + studID + ", t=" + teacher + ", marks=" + marks + "]";
	}
	
	
}
