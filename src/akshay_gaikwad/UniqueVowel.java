/* Print only unique vowels:
input: technocredits
output: oi */

package akshay_gaikwad;

public class UniqueVowel {
	
	void printUniqueVowel(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					System.out.print(ch);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new UniqueVowel().printUniqueVowel("technocredits"); 
	}
}
