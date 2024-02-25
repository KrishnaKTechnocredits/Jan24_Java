/*Assignment - 59 : 14th Feb'2024
PhenolV_Assignment_64
"Print the character with maximum frequency:
input: TeeCccChH
output: c->4"
*/

package phenol_verma;

public class StrMaxFreqChar {

	void maxFreqChar(String str) {
		int preCharCount = 0;
		int charIndex = 0;
		for (int index = 0; index < str.length(); index++) {
			str = str.toLowerCase();
			int count = 0;
			char ch = str.charAt(index);
			for (int inIndex = 0; inIndex < str.length(); inIndex++) {
				if (ch == str.charAt(inIndex)) {
					count++;
				}
			}
			if (preCharCount < count) {
				preCharCount = count;
				charIndex = index;
			}
		}
		System.out.println("Maximun char count for " + str.charAt(charIndex) + " is " + preCharCount);
	}

	public static void main(String[] args) {
		StrMaxFreqChar strMaxFreqChar = new StrMaxFreqChar();
		String oriString = "TeeCccChH";
		System.out.println("Original String = " + oriString);
		strMaxFreqChar.maxFreqChar(oriString);
	}
}
