/*Print all the characters from given String having frequency 1 (print unique characters from given string) [with indexOf & lastIndexOf]

String str = "technocredits";

output : hnordis*/

package sarang_kulkarni;

public class CharFreqEx2 {
	
	void uniqueChar(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			if (str.indexOf(ch) == str.lastIndexOf(ch) ) {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		
		new CharFreqEx2().uniqueChar("technocredits");
	}
}
