/*Assignment - 40 : 4th Feb'2024

Print all the names from given array which should start with consonant and ends with vowel.

input: {"Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima"}
Output : Sveta
		 Techno
		 Garima
*/

package padmaja;

public class PrintNamesFromArrayConsonantandVowel {

	boolean isStringstartswithConsonant(String str) {
		boolean flag = false;
		str = str.toLowerCase();
		char ch = str.charAt(0);
		if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
			flag = true;
		else
			flag = false;
		return flag;
	}

	boolean isStringendswithVowel(String str) {
		boolean flag = false;
		char ch = str.charAt(str.length() - 1);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			flag = true;
		else
			flag = false;
		return flag;
	}

	void printNames(String[] input) {
		for (int index = 0; index < input.length; index++) {
			if (isStringstartswithConsonant(input[index]) == true && isStringendswithVowel(input[index]) == true)
				System.out.println(input[index]);
		}
	}

	public static void main(String[] args) {
		String[] input = { "Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima" };
		PrintNamesFromArrayConsonantandVowel p = new PrintNamesFromArrayConsonantandVowel();
		p.printNames(input);
	}
}
