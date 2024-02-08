/*Assignment - 31 : 4th Feb'2024

Write a program to find character having maximum frequency from given String.

input : aakanksha
output : aakanksha -> a -> 4

input : teecccchnoceredites
output : teecccchnoceredites -> e -> 5

input : maulik
output : maulik having all unique characters */

package padmaja;

public class MaxFrequencyChar {

	int getCharFrequencyCount(String str, char targetCh) {
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
		char targetCh = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int count = getCharFrequencyCount(input, ch);
			if (max < count) {
				max = count;
				targetCh = ch;
			}
		}
		System.out.println(input + " : " + targetCh + "->" + max);
	}

	public static void main(String[] args) {
		MaxFrequencyChar maxFrequencyChar = new MaxFrequencyChar();
		maxFrequencyChar.printAllCharFreq("aakanksha");
		maxFrequencyChar.printAllCharFreq("teecccchnoceredites");
	}
}
