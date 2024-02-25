/*Assignment - 56 : 14th Feb'2024
PhenolV_Assignment_62
"Print only unique vowels:
input: technocredits
output: oi"
*/

package phenol_verma;

public class StrUniqueVowel {
	int strVwlCount(String str, char ch) {
		int count = 0;

		for (int index = 0; index < str.length(); index++) {
			char chr = str.charAt(index);
			if (chr == ch) {
				count++;
			}
		}
		return count;
	}

	void printVwlCount(String str) {
		str = str.toLowerCase();

		for (int index = 0; index < str.length(); index++) {
			char strChar = str.charAt(index);
			char strCharLower = str.charAt(index);
			if (strCharLower == 'a' || strCharLower == 'e' || strCharLower == 'i' || strCharLower == 'o' || strCharLower == 'u') {
				int strCharCount = strVwlCount(str, strCharLower);
				int strIndexOfChar = str.indexOf(str.charAt(index));
				if (strCharCount == 1 && strIndexOfChar == index) {
					System.out.print(strChar);
				}
			}
		}
	}

	public static void main(String[] args) {
		StrUniqueVowel strUniqueVowel = new StrUniqueVowel();
		String str = "technocredits";
		System.out.println("Original String - " + str);
		System.out.print("Unique vowel in string - ");
		strUniqueVowel.printVwlCount(str);
	}
}
