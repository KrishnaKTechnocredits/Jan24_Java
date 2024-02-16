/*
 Assignment - 58 : 14th Feb'2024
"Print last character with minimum frequency:
input: aakanksha
output: h->1"
 */

package padmaja;

public class LastChWithMinFreq {
	int getCharFreq(String str, char targetch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == targetch)
				count++;
		}
		return count;
	}

	void printLastChar(String str) {
		for (int index = str.length() - 1; index > 0; index--) {
			char targetch = str.charAt(index);
			int count = getCharFreq(str, targetch);
			if (count == 1) {
				System.out.println(targetch + " -> " + count);
				break;
			}
		}
	}

	public static void main(String[] args) {
		LastChWithMinFreq freq = new LastChWithMinFreq();
		freq.printLastChar("aakanksha");
	}
}
