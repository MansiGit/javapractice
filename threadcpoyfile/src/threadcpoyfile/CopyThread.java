package threadcpoyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyThread extends Thread{
	String file1;
	String file2;
	public CopyThread(String file1, String file2) {
		super();
		this.file1 = file1;
		this.file2 = file2;
	}
	public void run() 
	{
		try {
			FileInputStream fis = new FileInputStream(file1);
			FileOutputStream fos = new FileOutputStream(file2);
			int data;
			while (true) {
				data = fis.read();
				if (data == -1)
					break;
				fos.write(data);
			}
			fis.close();
			fos.close();
			System.out.println("File Copied");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
