/*Assignment - 39 : 4th Feb'2024

Print all the names from given array having length more than 5 characters and should start with upper case.

input: {"Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno", "harsh", "phenol"}
Output ; Aashvi
		 Sameer
		 Techno */

package padmaja;

public class PrintNamesFromArray {
	boolean isStartWithUpperCase(String name) {
		char ch = name.charAt(0);
		if (Character.isUpperCase(ch) == true)
			return true;
		else
			return false;
	}

	void printNames(String[] input) {
		boolean temp = false;
		for (int index = 0; index < input.length; index++) {
			temp = isStartWithUpperCase(input[index]);
			if (input[index].length() > 5 && temp == true)
				System.out.println(input[index]);
		}
	}

	public static void main(String[] args) {
		String[] input = { "Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno", "harsh", "phenol" };
		PrintNamesFromArray printnames = new PrintNamesFromArray();
		printnames.printNames(input);
	}
}
