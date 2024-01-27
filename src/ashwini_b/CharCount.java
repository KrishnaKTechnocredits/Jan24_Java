package ashwini_b;

import java.util.Iterator;

/*
Print the frequency of the given character from the given String without case 
sensitivity (count lower + upper case), 
please consider given character will be passed as lowercase.

Input : technocrediTs teaches Technology.
Char: t
Output : frequency of t in technocredits is 4.
 */
public class CharCount {

	void printCharCount(String str, char ch) {
		int count = 0;
		str = str.toLowerCase();
		for (int index = 0; index <= str.length() - 1; index++) {
			if (ch == str.charAt(index)) {
				count++;
			}
		}
		System.out.println("frequency of " + ch + " in " + str + " is " + count + ".");
	}

	public static void main(String[] args) {
		CharCount charCount = new CharCount();
		charCount.printCharCount("technocrediTs teaches Technology.", 't');
	}

}
