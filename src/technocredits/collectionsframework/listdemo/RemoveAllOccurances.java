package technocredits.collectionsframework.listdemo;

import java.util.ArrayList;

public class RemoveAllOccurances {
	
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

		int count = 0;
		while(listOfNames.remove("Akshay")){
			count++;
		}
		

		System.out.println(count);
		System.out.println(listOfNames);
	}
}
