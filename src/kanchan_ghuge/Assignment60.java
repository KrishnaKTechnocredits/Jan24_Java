/*Print character with second-highest frequency:
input: aakanksha
output: k->2  */

package kanchan_ghuge;

class Assignment60 {

	int getCharFreq(String str1, char ch1) {
		str1 = str1.toLowerCase();
		int count = 0;
		for (int index = 0; index < str1.length(); index++) {
			char ch = str1.charAt(index);
			if (ch == ch1)
				count++;
		}
		return count;
	}

	char charWithMaxFreq(String input) {
		int maxcount = 0;
		char targetch = ' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int count = getCharFreq(input, ch);
			if (maxcount < count) {
				maxcount = count;
				targetch = input.charAt(index);
			}
		}
		return targetch;
	}

	void nthMaximum(String str, int nthMax) {
		char maxchar = ' ';
		if (nthMax == 1) {
			maxchar = charWithMaxFreq(str);
		} else {
			for (int index = 2; index <= nthMax; index++) {
				maxchar = charWithMaxFreq(str);
				str = str.replace(Character.toString(maxchar), "");
				maxchar = charWithMaxFreq(str);
			}
		}
		int maxCharcount = getCharFreq(str, maxchar);
		System.out.println("Second Highest character with freq is = " + maxchar + " = " + maxCharcount);
	}

	public static void main(String[] args) {
		String str = "aakanksha";
		new Assignment60().nthMaximum(str, 2);
	}
}
