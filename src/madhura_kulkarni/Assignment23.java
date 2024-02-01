/*Assignment - 23 : 29th Jan'2024
Print all the characters from given String having frequency 1 (print unique characters from given string) [without indexOf & lastIndexOf]

String str = "technocredits";
output : hnordis
*/

package madhura_kulkarni;

public class Assignment23 {

	int getchfreq(String str1, char ch) {
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			char ch1 = str1.charAt(i);
			if (ch1 == ch) {
				count++;
			}
		}
		return count;

	}

	void strFreq(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int count = getchfreq(input, ch);
			// System.out.print("The unique characters from the given string are: ");
			if (count == 1)
				System.out.print(ch);
		}
	}

	public static void main(String[] args) {
		String str1 = "technocredits";
		Assignment23 ass23 = new Assignment23();
		ass23.strFreq(str1);
	}

}
