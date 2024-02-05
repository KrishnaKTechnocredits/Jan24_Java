//Assignment - 31 : 4th Feb'2024

package puja_poreddiwar;

public class MaxFreqInString {

	int getCharFrequency(String str, char targetCh) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == targetCh) {
				count++;
			}
		}
		return count;
	}

	void printAllCharFreq(String input) {
		int max = 0;
		char targetCh = ' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int count = getCharFrequency(input, ch);
			if (max < count) {
				max = count;
				targetCh = ch;
			}
		}
		if (max == 1) {
			System.out.println("All characters in '" + input + "' are unique");
		} else {
			System.out.println("character having maximum frequency in " + input + " string is: " + targetCh + " : " + max);
		}
	}

	public static void main(String[] args) {
		MaxFreqInString interviewEx1 = new MaxFreqInString();
		interviewEx1.printAllCharFreq("aakanksha");
		interviewEx1.printAllCharFreq("teecccchnoceredites");
		interviewEx1.printAllCharFreq("puja");

	}

}
