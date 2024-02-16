/*
 *Assignment - 56 : 14th Feb'2024
"Print only unique vowels:
input: technocredits
output: oi"
 */

package padmaja;

public class UniqueVowels {

	int getFreqOfVowel(String str, char targetch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (targetch == ch)
				count++;
		}
		return count;
	}

	void printUniqueVowel(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.toLowerCase().charAt(index);
			int count = getFreqOfVowel(str, ch);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				if (count == 1)
					System.out.println(ch);
			}
		}
	}

	public static void main(String[] args) {
		UniqueVowels uniqueVowel = new UniqueVowels();
		uniqueVowel.printUniqueVowel("technocredits");
	}
}
