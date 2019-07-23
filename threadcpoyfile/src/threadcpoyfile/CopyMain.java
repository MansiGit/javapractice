package threadcpoyfile;

public class CopyMain {

	public static void main(String[] args) throws InterruptedException {
		CopyThread c1=new CopyThread("D:/file1.txt","D:/javapractice/file2.txt");
		CopyThread c2=new CopyThread("D:/file3.txt","D:/javapractice/file4.txt");
		
		c1.start();
		c1.join();
		c2.start();
	}

}
