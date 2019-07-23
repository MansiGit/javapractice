package prog2;

public class twodimarray {

	/*
	 * display each array with sum
	 */

	public static void main(String arg[]) {
		int x[][] = new int[5][];
		int k = 0;
		for (int i = 0; i < x.length; i++) {
			x[i] = new int[3];
			for (int j = 0; j < 3; j++) {
				x[i][j] = k++;
			}
		}
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum = 0;
			System.out.print("Row " + i + " is=  ");
			for (int j = 0; j < x[i].length; j++) {
				sum += x[i][j];
				System.out.print(x[i][j] + " ");
			}
			System.out.println("\nSum of row is: " + sum + "\navg= " + (float) (sum / x[i].length));
		}

	}
}
