/*Assignment - 60 : 14th Feb'2024
"Print character with second-highest frequency:
input: aakanksha
output: k->2"*/
package madhura_kulkarni;

public class Assignment60 {

	int getCharFreq(String str1, char ch1) {
		str1 = str1.toLowerCase();
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == ch1)
				count++;
		}
		return count;
	}

	char charWithMaxFreq(String input) {
		int maxCount = 0;
		char targetch = ' ';
		for (int i = 0; i < input.length(); i++) {
			int count = getCharFreq(input, input.charAt(i));
			if (maxCount < count) {
				maxCount = count;
				targetch = input.charAt(i);
			}
		}
		return targetch;
		// System.out.println("Character with max count is: " + target + "->" +
		// maxCount);
	}

	void nthMaximum(String str, int nthMax) {
		char maxchar = ' ';
		if (nthMax == 1) {
			maxchar = charWithMaxFreq(str);
		} else {
			for (int i = 2; i <= nthMax; i++) {
				maxchar = charWithMaxFreq(str);
				str = str.replace(Character.toString(maxchar), "");
				maxchar = charWithMaxFreq(str);
			}
		}
		int maxCharCount = getCharFreq(str, maxchar);
		System.out.println("Second highest character with frequency is: " + maxchar + "->" + maxCharCount);
	}

	public static void main(String[] args) {
		String str = "aakanksha";
		new Assignment60().nthMaximum(str, 2);
	}

}
