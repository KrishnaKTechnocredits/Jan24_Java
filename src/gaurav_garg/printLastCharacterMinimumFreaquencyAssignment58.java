/*
 "Print last character with minimum frequency:
input: aakanksha
output: h->1"
 */
package gaurav_garg;

public class printLastCharacterMinimumFreaquencyAssignment58 {

	static int getcount(String str, char c) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == c) {
				count++;
			}
		}
		return count;
	}

	static void printLastCharacterMinimumFrequency(String str) {
		for (int index = str.length() - 1; index > 0; index--) {
			char ch = str.charAt(index);
			int getcount = getcount(str, ch);
			if (getcount == 1) {
				System.out.print(ch + " -> " + getcount);
				break;
			}
		}
	}

	public static void main(String[] args) {
		printLastCharacterMinimumFrequency("aakanksha");
	}
}
