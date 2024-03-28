package technocredits.collectionsframework.listdemo;

import java.util.ArrayList;

public class Example7 {
	
	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Shramika");
		listOfNames.add("Akshay");
		listOfNames.add("Gaurav");
		listOfNames.add("Rupali");
		listOfNames.add("Madhura");
		listOfNames.add("Akshay");
		listOfNames.add("Shridhar");
		listOfNames.add("Sarang");
		listOfNames.add("Akshay");
		listOfNames.add("Dharma");
		
		System.out.println(listOfNames.indexOf("Madhura"));
		System.out.println(listOfNames.lastIndexOf("Madhura"));
	}
}
