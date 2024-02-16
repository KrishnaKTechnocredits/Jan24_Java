package hiral_purohit;
//"Print character with second-highest frequency:

//input: aakanksha
//output: k->2"

public class Assignment_60 {

	int togetFreqOfChar(String input, char target) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == target) {
				count++;
			}
		}
		return count;
	}

	char toGetMaxChar(String str) {
		int max = 0;
		char maxChar = ' ';
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int count = togetFreqOfChar(str, ch);
			if (count > max) {
				max = count;
				maxChar = ch;
			}
		}
		return maxChar;
	}

	void toPrintSecondHighFreq(String input) {
		char maxChar = toGetMaxChar(input);
		input = input.replace(Character.toString(maxChar), "");
		maxChar = toGetMaxChar(input);
		int count = togetFreqOfChar(input, maxChar);
		System.out.println(maxChar + " -> " + count);
	}

	public static void main(String[] args) {
		new Assignment_60().toPrintSecondHighFreq("aakanksha");
	}

}
