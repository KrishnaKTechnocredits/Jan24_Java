package phenol_verma;

import java.util.ArrayList;

public class RemoveDuplicateName {

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

		System.out.print("Original ArrayList  - ");
		System.out.println(listOfNames);

		for (int index = 0; index < listOfNames.size(); index++) {
			String currentName = listOfNames.get(index);
			for (int nextIndex = index + 1; nextIndex < listOfNames.size(); nextIndex++) {
				if (currentName.equals(listOfNames.get(nextIndex))) {
					listOfNames.remove(nextIndex);
					nextIndex--;
				}
			}
		}
		System.out.println("****************************************************************");
		System.out.print("Modified ArrayList after removing duplicate - ");
		System.out.println(listOfNames);
	}
}
