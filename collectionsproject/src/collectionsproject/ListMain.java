package collectionsproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class ListMain {

	public static void main(String[] args) {
		TreeSet<String> a1= new TreeSet<String>();
		a1.add("Mansi");
		a1.add("Pratyusha");
		a1.add("Arpna");
		a1.add("Samridhi");
		a1.add("Sushmitha");
		//System.out.println(a1.get(1));

		//System.out.println(a1.get(4));
		System.out.println("No of elements: "+a1.size());

		Iterator<String> i = a1.iterator();
		while (i.hasNext()) {
		         System.out.println(i.next());
		 }
		for(Object d: a1)
		{
			System.out.println(d);
		}
	}

}
