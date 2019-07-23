package fileio;

import java.io.*;

public class FileCopy {
	public static void main(String args[]) throws IOException {
		try {
			FileInputStream fis = new FileInputStream("D:/Soft/myfile.txt");
			FileOutputStream fos = new FileOutputStream("D:/Soft/mynewfile.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			//BufferedOutputStream bos = new BufferedOutputStream(fos);
			int data;
			while (true) {
				data = bis.read();
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
		}

	}
}
