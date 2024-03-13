/*Assignment - 39 : 4th Feb'2024

Print all the names from given array having length more than 5 characters and should start with upper case.

input: {"Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno"}
Output ; Aashvi
		 Sameer
		 Techno  */

package kanchan_ghuge;

public class Assignment39 {

	void printNames(String[] str) {
		String names = " ";
		System.out.println("Output Array is ----> ");
		for (int index = 0; index < str.length; index++) {
			names = str[index];
			char ch = names.charAt(0);
			if (str[index].length() > 5 && Character.isUpperCase(ch)) {
				System.out.println(names);
			}
		}
	}

	public static void main(String[] args) {
		String[] name = { "Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno" };
		new Assignment39().printNames(name);
	}
}
