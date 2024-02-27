/*Print the character with maximum frequency:
input: TeeCccChH
output: c->4  */

package kanchan_ghuge;

class Assignment59 {

	int getCharFreq(String str1, char ch1) {
		str1 = str1.toLowerCase();
		int count = 0;
		for (int index = 0; index < str1.length(); index++) {
			if (str1.charAt(index) == ch1)
				count++;
		}
		return count;
	}

	void printCharWithMaxFreq(String input) {
		int maxcount = 0;
		char target = ' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int count = getCharFreq(input, ch);
			if (maxcount < count) {
				maxcount = count;
				target = input.charAt(index);
			}
		}
		System.out.println("Cahracter with max count are = " + target + " = " + maxcount);
	}

	public static void main(String[] args) {
		String str = "TeeCccChH";
		new Assignment59().printCharWithMaxFreq(str);
	}
}
