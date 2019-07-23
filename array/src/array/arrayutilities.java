package array;

public final class arrayutilities {

	private arrayutilities() {
	}

	static int[] modify(int arr[], int newsize) {
		if (arr == null)
			return new int[newsize];
		if (newsize <= arr.length)
			return arr;

		int brr[] = new int[newsize];
		int j = 0;
		for (int i : arr) {
			System.out.print(i + " ");
			brr[j++] = i;
		}
		System.out.println();
		for (int i : brr) {
			System.out.print(i + " ");
		}
		return brr;
	}

	static int[] flaten(int arr[][]) {
		
		if(arr==null)
			return null;
		
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=null)
				cnt+=arr[i].length;
		}
		
		int brr[] = new int[cnt];
		int x = 0;
		for (int i = 0; i < arr.length; i++){
			if(arr[i]!=null)
			{
				for (int j = 0; j < arr[i].length; j++)
					brr[x++] = arr[i][j];
			}
		}
		return brr;
	}
}
