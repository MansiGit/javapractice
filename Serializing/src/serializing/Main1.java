package serializing;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fos=new FileInputStream("D:/data.ser");
		ObjectInputStream ois=new ObjectInputStream(fos);
		StudentContainer sc=(StudentContainer) ois.readObject();
		ois.close();
		System.out.println(sc);
		System.out.println("object retrieved");
	}
}
