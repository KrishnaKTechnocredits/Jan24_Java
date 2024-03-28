package technocredits.collectionsframework.setdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// A-Z [65-90]
// a-z [97-122]

public class Example4 {
	
	public static void main(String[] args) {
		Set<String> setOfCustomers = new HashSet<String>();
		setOfCustomers.add("Sveta");
		setOfCustomers.add("ashvi");
		setOfCustomers.add("Techno"); 
		setOfCustomers.add("credits");
		setOfCustomers.add("jay");
		setOfCustomers.add("credits");
		setOfCustomers.add("onkar");
		setOfCustomers.add("deepak");
		setOfCustomers.add("Shweta");
		
		List<String> listOfCustomers = new ArrayList<>(setOfCustomers);
		Collections.sort(listOfCustomers,Collections.reverseOrder());
		
		System.out.println(listOfCustomers);
		
	}
}
