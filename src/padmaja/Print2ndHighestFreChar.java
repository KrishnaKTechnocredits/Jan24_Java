/*Assignment - 60 : 14th Feb'2024
		"Print character with second-highest frequency:
		input: aakanksha
		output: k->2" */

package padmaja;

public class Print2ndHighestFreChar {
	int getFreqOfChar(String str, char targetch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == targetch)
				count++;
		}
		return count;
	}

	char getMaxFreqChar(String str) {
		int maxFreq = 0;
		char ch = ' ';
		for (int index = 0; index < str.length(); index++) {
			char targetch = str.charAt(index);
			int count = getFreqOfChar(str, targetch);
			if (count > maxFreq) {
				maxFreq = count;
				ch = targetch;
			}
		}
		return ch;
	}

	public static void main(String[] args) {
		String input = "aakanksha";
		Print2ndHighestFreChar freq = new Print2ndHighestFreChar();
		char ch = freq.getMaxFreqChar(input);
		input = input.replace(Character.toString(ch), "");
		ch = freq.getMaxFreqChar(input);
		int count = freq.getFreqOfChar(input, ch);
		System.out.println(ch + "-->" + count);
	}
}
