/*Assignment - 55 : 14th Feb'2024
"Print only characters occurring exactly twice:
input: teecccchhhnno;
output: en"
 */

package padmaja;

public class FindCharWithFreq2 {

	int getFreqOfChar(String str, char targetch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == targetch)
				count++;
		}
		return count;
	}

	void printCharWithFreq2(String str) {
		System.out.print("Character with frequency 2 are " + ": ");
		for (int i = 0; i < str.length(); i++) {
			char targetch = str.charAt(i);
			int freq = getFreqOfChar(str, targetch);
			if (freq == 2)
				if (i == str.indexOf(targetch))
					System.out.print(targetch);
		}
	}

	public static void main(String[] args) {
		new FindCharWithFreq2().printCharWithFreq2("teecccchhhnno");
	}
}
