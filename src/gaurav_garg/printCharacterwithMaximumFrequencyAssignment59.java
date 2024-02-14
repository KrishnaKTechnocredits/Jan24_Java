/*
Print the character with maximum frequency:
input: TeeCccChH
output: c->4"
 */
package gaurav_garg;

public class printCharacterwithMaximumFrequencyAssignment59 {

	int getcount(String str, char c) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == c) {
				count++;
			}
		}
		return count;
	}

	void printCharacterwithMaxFrequency(String str) {
		int max = 0;
		char c = '*';
		str = str.toLowerCase();
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int getcount = getcount(str, ch);
			if (getcount > max) {
				max = getcount;
				c = ch;
			}
		}
		System.out.print(c + "-> " + max);
	}

	public static void main(String[] args) {
		new printCharacterwithMaximumFrequencyAssignment59().printCharacterwithMaxFrequency("TeeCccChH");
	}
}
