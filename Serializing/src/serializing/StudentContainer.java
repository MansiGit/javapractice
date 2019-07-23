package serializing;
import java.io.*;
public class StudentContainer implements Serializable{
	Student student1;
	Student student2;

	public void setStudent1(Student student1) {
		this.student1 = student1;
	}

	@Override
	public String toString() {
		return "DataHolder [student1=" + student1 + ", student2=" + student2 + "]\n";
	}

	public void setStudent2(Student student2) {
		this.student2 = student2;
	}
	
	
}
