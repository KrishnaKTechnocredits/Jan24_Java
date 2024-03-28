package technocredits.collectionsframework.setdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example3 {	
	
	public static void main(String[] args) {
		Set<String> setOfCustomers = new LinkedHashSet<String>();
		setOfCustomers.add("sveta");
		setOfCustomers.add("ashvi");
		setOfCustomers.add("techno");
		setOfCustomers.add("credits");
		setOfCustomers.add("jay");
		setOfCustomers.add("credits");
		setOfCustomers.add("onkar");
		setOfCustomers.add("deepak");
		
		System.out.println(setOfCustomers);
		ArrayList<String> listOfStudents = new ArrayList<String>(setOfCustomers);
		System.out.println(listOfStudents);
		System.out.println("Name of the student who enter first : " + listOfStudents.get(0));
		System.out.println("Name of the student who enter last : " + listOfStudents.get(listOfStudents.size()-1));
	
		Collections.sort(listOfStudents);
		System.out.println(listOfStudents);
	}
}
