//Write a program to find character having maximum frequency from given String.
package priya_t;

public class Assignment31_CharMaxFreqfromString {
   int getCharFreqCount(String str, char targetCh) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == targetCh)
				count++;
		}
		return count;
	}

	void printAllCharFreqCount(String input) {
		int max = 0;
		char targetCh = ' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int count = getCharFreqCount(input, ch);
			if (max < count) {
				max = count;
				targetCh = ch;
			}
		}

		if (max == 1) {
           System.out.println(input + " all characters are unique");
		} else {
			System.out.println(input + " : " + targetCh + "->" + max);
		}
	}

	public static void main(String[] args) {
        Assignment31_CharMaxFreqfromString test = new Assignment31_CharMaxFreqfromString();
		test.printAllCharFreqCount("aakanksha");
		test.printAllCharFreqCount("teecccchnoceredites");
		test.printAllCharFreqCount("maulik");
   }

}