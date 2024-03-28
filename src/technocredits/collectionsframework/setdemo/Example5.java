package technocredits.collectionsframework.setdemo;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

// A-Z [65-90]
// a-z [97-122]

public class Example5 {
	
	public static void main(String[] args) {
		Set<String> setOfCustomers = new TreeSet<String>();
		setOfCustomers.add("Sveta");
		setOfCustomers.add("ashvi");
		setOfCustomers.add("Techno"); 
		setOfCustomers.add("credits");
		setOfCustomers.add("jay");
		setOfCustomers.add("credits");
		setOfCustomers.add("onkar");
		setOfCustomers.add("deepak");
		setOfCustomers.add("Shweta");
		
		System.out.println(setOfCustomers);
		
	}
}
