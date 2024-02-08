/*Assignment - 23 : 29th Jan'2024
Print all the characters from given String having frequency 1 (print unique characters from given string) [without indexOf & lastIndexOf]

String str = "technocredits";
output : hnordis*/

package sarang_kulkarni;

public class UniqueCharEx1 {

		int charFreq(String str, char ch) {
			int count = 0;
			for (int i = 0; i< str.length(); i++) {
				char ch1 = str.charAt(i);
				if (ch == ch1) {
					count++;
				}
			}
			return (count);
		}

		public void uniqueChar(String str) {
			for (int index = 0; index < str.length(); index++) {
				char ch = str.charAt(index);
				int charcount = charFreq(str, ch);
				if (charcount == 1) {
					System.out.print(ch);
				}
			}
		}

		public static void main(String[] args) {
			 new UniqueCharEx1().uniqueChar("technocredits");
		}
}

