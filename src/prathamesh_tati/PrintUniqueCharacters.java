/*Assignment - 23 : 29th Jan'2024
Print all the characters from given String having frequency 1 (print unique characters from given string) [without indexOf & lastIndexOf]

String str = "technocredits";
output : hnordis*/

package prathamesh_tati;

public class PrintUniqueCharacters {

	int getcharFrequncy(String str, char ch) {
		int count = 0;

		for (int index = 0; index <= str.length() - 1; index++) {
			if (str.charAt(index) == ch)
				count++;
		}
		return count;
	}

	void printChar(String str) {

		for (int index = 0; index <= str.length() - 1; index++) {
			char ch = str.charAt(index);
			int charCount = getcharFrequncy(str, ch);

			if (charCount == 1)
				System.out.print(ch);
		}
	}

	public static void main(String[] args) {
		PrintUniqueCharacters printUniqueCharacters = new PrintUniqueCharacters();
		printUniqueCharacters.printChar("technocredits");
	}
}