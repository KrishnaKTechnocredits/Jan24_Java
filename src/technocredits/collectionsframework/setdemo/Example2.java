package technocredits.collectionsframework.setdemo;

import java.util.HashSet;

public class Example2 {

	public static void main(String[] args) {
		HashSet<String> setOfCustomers = new HashSet<String>();
		setOfCustomers.add("sveta");
		setOfCustomers.add("ashvi");
		setOfCustomers.add("techno");
		setOfCustomers.add("credits");
		setOfCustomers.add("jay");
		setOfCustomers.add("onkar");
		setOfCustomers.add("deepak");
		
		for(String name : setOfCustomers) {
			if(name.length()>5)
				System.out.println(name);
		}
		
	}
}
