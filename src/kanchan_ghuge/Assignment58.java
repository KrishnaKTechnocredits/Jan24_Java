/*Print last character with minimum frequency:
input: aakanksha
output: h->1 */

package kanchan_ghuge;

class Assignment58 {

	int getCharFreq(String str, char targetch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == targetch) {
				count++;
			}
		}
		return count;
	}

	void printLastCharWithminimumFreq(String str) {
		int minimum = str.length();
		char targetch = ' ';
		for (int index = str.length() - 1; index >= 0; index--) {
			char ch = str.charAt(index);
			int count = getCharFreq(str, ch);
			if (minimum > count) {
				minimum = count;
				targetch = ch;
			}
		}
		System.out.println(targetch + " = " + minimum);
	}

	public static void main(String[] args) {
		String input = "aakanksha";
		new Assignment58().printLastCharWithminimumFreq(input);
	}
}
