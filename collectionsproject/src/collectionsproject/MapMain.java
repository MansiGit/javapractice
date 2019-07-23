package collectionsproject;

import java.util.HashMap;
import java.util.Scanner;

public class MapMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("CH", "Chennai");
		map.put("PN", "Pune");
		map.put("HY", "Hyderabad");
		map.put("DL", "Delhi");
		map.put("CA", "Calcutta");
		
		System.out.println("Enter code: ");
		String key = sc.next();
		
		if (map.containsKey(key))
			System.out.println(map.get(key));
		else {
			System.out.println("KEY DOES NOT EXIST");
			System.out.println("Enter name of " + key + " City :");
			String name = sc.next();
			map.put(key, name);
			System.out.println("Added : " + key + " " + map.get(key));
		}
		System.out.println("Deli has been removed? " +map.remove("DL","Delhi"));
		sc.close();
	}

}
