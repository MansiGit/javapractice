package serializing;
import java.io.*;
public class SerializingMain {

	public static void main(String[] args) throws IOException {
		Teacher teacher=new Teacher(10,"Sunita",16000);
		Student student1=new Student("Student one",100,teacher,89);
		Student student2=new Student("Student two",200,teacher,99);
		
		StudentContainer sc= new StudentContainer();
		sc.setStudent1(student1);
		sc.setStudent2(student2);
		
		FileOutputStream fos=new FileOutputStream("D:/data.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(sc);
		oos.close();
		System.out.println(sc);
		System.out.println("object Saved");
	}

}
