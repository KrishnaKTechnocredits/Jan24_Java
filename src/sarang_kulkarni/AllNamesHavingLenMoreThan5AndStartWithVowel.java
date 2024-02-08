/*Assignment - 39 : 4th Feb'2024

Print all the names from given array having length more than 5 characters and should start with upper case.

input: {"Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno", "harsh", "phenol"}
Output ; Aashvi
		 Sameer
		 Techno*/
package sarang_kulkarni;

public class AllNamesHavingLenMoreThan5AndStartWithVowel {

	boolean isStartWithUpperCase(String name) {
		char ch = name.charAt(0);
		if (Character.isUpperCase(ch) == true)
			return true;
		else
			return false;
	}

	void printNames(String[] names) {
		boolean temp = false;
		for (int index = 0; index < names.length; index++) 
		{
			temp = isStartWithUpperCase(names[index]);
			if (names[index].length() > 5 && temp == true) 
			{
				System.out.println(names[index]);
			}
		} 

	}

	public static void main(String[] args) {
		String[] names = { "Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno" };
		new AllNamesHavingLenMoreThan5AndStartWithVowel().printNames(names);
	}
}
