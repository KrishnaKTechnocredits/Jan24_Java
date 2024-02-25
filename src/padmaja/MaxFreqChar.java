/*Assignment - 59 : 14th Feb'2024
"Print the character with maximum frequency:
input: TeeCccChH
output: c->4"
 */

package padmaja;

public class MaxFreqChar {
	int getcharFreq(String str, char targetch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = Character.toLowerCase(str.charAt(index));
			if (ch == targetch)
				count++;
		}
		return count;
	}

	void printMaxFreqChar(String str) {
		int maxFreq = 0;
		char maxFreqCh = ' ';
		for (int index = 0; index < str.length(); index++) {
			char targetch = Character.toLowerCase(str.charAt(index));
			int count = getcharFreq(str, targetch);
			if (count > maxFreq) {
				maxFreq = count;
				maxFreqCh = targetch;
			}
		}
		System.out.println(maxFreqCh + " -> " + maxFreq);
	}

	public static void main(String[] args) {
		MaxFreqChar maxFreqChar = new MaxFreqChar();
		maxFreqChar.printMaxFreqChar("TeeCccChH");
	}
}
