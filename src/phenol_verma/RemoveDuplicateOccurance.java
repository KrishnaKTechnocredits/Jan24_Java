package phenol_verma;

import java.util.ArrayList;

public class RemoveDuplicateOccurance {

	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Varsha");
		listOfNames.add("Shramika");
		listOfNames.add("Sarang");
		listOfNames.add("Akshay");
		listOfNames.add("Gaurav");
		listOfNames.add("Rupali");
		listOfNames.add("Madhura");
		listOfNames.add("Akshay");
		listOfNames.add("Shridhar");
		listOfNames.add("Madhura");
		listOfNames.add("Sarang");
		listOfNames.add("Akshay");
		listOfNames.add("Dharma");
		listOfNames.add("Sarang");
		listOfNames.add("Varsha");

		ArrayList<String> uniqueList = new ArrayList<>();

		for (String name : listOfNames) {
			if (!uniqueList.contains(name)) {
				uniqueList.add(name);
			}
		}
		System.out.print("Original ArrayList  - ");
		System.out.println(listOfNames);

		System.out.print("Modified ArrayList after removing duplicate - ");
		System.out.println(uniqueList);
	}
}
