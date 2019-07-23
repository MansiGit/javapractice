package prog2;

public class test {

	public static void main(String arg[]) {
		int x[] = new int[10];
		/*
		 * sum of the values average element at even positions smallest values
		 * in the array
		 */

		int sum = 0;
		//int j=0;
		for (int i = 0; i < x.length; i++)
		{
			x[i]=i; 
			System.out.println(x[i]); 
			sum+=x[i]; 
		}
		System.out.println("even positions: ");
		for (int i = 0; i < x.length; i = i + 2) {
			System.out.println(x[i]);
		}

		System.out.println("Sum= " + sum + "\navg= " + (sum / x.length));
		System.out.println(x + " " + x.length);
	}
}
