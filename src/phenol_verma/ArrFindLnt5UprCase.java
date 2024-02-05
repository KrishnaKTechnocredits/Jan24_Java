/*
 *Assignment - 38 : 4th Feb'2024
PhenolV_Assignment_44
Print all the names from given array having length more than 5 characters and should start with upper case.
input: {"Aashvi", "sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno"}
Output ; Aashvi
		 Sameer
		 Techno
 */
package phenol_verma;

public class ArrFindLnt5UprCase {

	void findLenghtUppercase(String arr[]) {
		boolean flag;
		System.out.println("Array having length more than 5 characters are - ");

		for (int index = 0; index < arr.length; index++) {
			char ch = arr[index].charAt(0);
			if (Character.isUpperCase(ch)) {
				if (arr[index].length() >= 5) {
					System.out.println(arr[index]);
				}
			}
		}
	}

	public static void main(String[] args) {
		ArrFindLnt5UprCase arrFindLnt5UprCase = new ArrFindLnt5UprCase();
		String arr[] = { "Aashvi", "sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno" };
		arrFindLnt5UprCase.findLenghtUppercase(arr);
	}

}
