package array;
import java.io.*;

public class array {
	public static void main(String args[]) {
		/*
		 * int arr[]={1,2,3,4,5}; arr= arrayutilities.modify(arr, 10); for(int
		 * i:arr) { System.out.println(i+" "); }
		 */

		//int arr[][]={ { 1, 2, 3, 4, 5 }, { 2, 3, 4 }, null, { 7 } };// = new int[3][];//{ { 1, 2, 3, 4, 5 }, { 2, 3, 4 }, null, { 7 } };//null;//{ { 1, 2, 3, 4, 5 }, { 2, 3, 4 }, { 5, 7, 8 }, { 7 } };
		//arr=new int[3][];
		//arr[0]=new int[]{3,4,5};
		/*int brr[]= arrayutilities.flaten(arr);
		
		if (brr!=null)
			for (int i = 0; i < brr.length; i++)
				System.out.print(brr[i] + " ");*/
		
		int a[]={8,5,6,3,2,1,4,7,9,6,0};
		try {
			FileReader fr = new FileReader("c:/abc.txt");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		int sum=0;
		try{
		for(int i=0;;i++)
		{
			sum+=a[i];
		}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Sum is "+sum);	
		}
		System.out.println("gehe");
	}
}
