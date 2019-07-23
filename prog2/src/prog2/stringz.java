package prog2;

public class stringz {

	public static void main(String arg[]) {

		/*
		 * String str = "hello"; String str1 = "hello";
		 * 
		 * if (str == str1) System.out.println("true"); if (str.equals(str1))
		 * System.out.println("true");
		 * 
		 * String str2 = new String("Hello"); String str3 = new String("Hello");
		 * 
		 * if (str2 == str3) System.out.println("true1"); if (str2.equals(str3))
		 * System.out.println("true");
		 * true true true
		 */

		String s = "";
		long start = System.currentTimeMillis();
		//for (char ch = 'A'; ch <= 'z'; ch++) {
		for (int i = 0; i < 7000; i++){
			s = s + "d";
		}

		long end = System.currentTimeMillis();
		//System.out.println(s);
		System.out.println((long) end - start);

		start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 7000; i++){
			sb.append("d");
		}
		end = System.currentTimeMillis();
		//System.out.println(sb);

		System.out.println((long)end - start);
	}
}
