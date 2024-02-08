/*
 *Print all the names from given array having length more than 5 characters and should start with upper case.

input: {"Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno", "harsh", "phenol"}
Output ; Aashvi
		 Sameer
		 Techno

 */
package suresh.array;

public class PrintAllStringwithChar5 {

	void getPrintCharOfFive(String[] input) {
		for (int i = 0; i < input.length; i++) {
			boolean flag = input[i].length() > 5 && Character.isUpperCase(input[i].charAt(0));

			if (flag == true) {

				System.out.println(input[i]);
			}

		}
	}

	public static void main(String[] args) {
		String[] arry = { "Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno" };
		new PrintAllStringwithChar5().getPrintCharOfFive(arry);
	}
}
