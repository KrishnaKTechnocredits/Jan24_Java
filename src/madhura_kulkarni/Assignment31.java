/*Assignment - 31 : 4th Feb'2024

Write a program to find character having maximum frequency from given String.

input : aakanksha
output : aakanksha -> a -> 4

input : teecccchnoceredites
output : teecccchnoceredites -> e -> 5

input : maulik
output : maulik having all unique characters*/

package madhura_kulkarni;

public class Assignment31 {

	int getCharFreq(String input, char targetch) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == targetch)
				count++;
		}
		return count;
	}

	void printCharFreq(String input) {
		int max = 0;
		char targetch = ' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int count = getCharFreq(input, ch);
			if (max < count) {
				max = count;
				targetch = ch;
			}
		}
		if (max == 1)
			System.out.println(input + " is having all unique characters.");
		else
			System.out.println(input + " -> " + targetch + " -> " + max);
	}

	public static void main(String[] args) {
		Assignment31 maxfreq = new Assignment31();
		maxfreq.printCharFreq("aakanksha");
		maxfreq.printCharFreq("teecccchnoceredites");
		maxfreq.printCharFreq("maulik");
	}

}
