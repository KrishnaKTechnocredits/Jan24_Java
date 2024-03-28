package technocredits.collectionsframework.setdemo;

import java.util.HashSet;

public class Example1 {

	public static void main(String[] args) {
		HashSet<String> setOfCustomers = new HashSet<String>();
		setOfCustomers.add("C4");
		setOfCustomers.add("C2");
		setOfCustomers.add("C1");
		setOfCustomers.add("C1");
		setOfCustomers.add("C2");
		setOfCustomers.add("C3");
		setOfCustomers.add("C4");
		setOfCustomers.add("C3");
		setOfCustomers.add("C2");
		setOfCustomers.add("C4");
		
		System.out.println(setOfCustomers);
		
		String str = "Maulik";
		System.out.println(str.hashCode());
	}
}
