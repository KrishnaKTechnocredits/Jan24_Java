/*Assignment - 39 : 4th Feb'2024

Print all the names from given array having length more than 5 characters and should start with upper case.

input: {"Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno"}
Output ; Aashvi
		 Sameer
		 Techno*/

package pallavi_raut;

class FindNameCharFiveAndCapital {

	public static void main(String[] args) {
		String[] arr = { "Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno" };
		new FindNameCharFiveAndCapital().printNameCharFiveAndCapital(arr);
	}

	void printNameCharFiveAndCapital(String[] str) {
		for (int index = 0; index < str.length; index++) {
			if (str[index].length() > 5 && Character.isUpperCase(str[index].charAt(0)))
				System.out.println(str[index]);
		}
	}
}