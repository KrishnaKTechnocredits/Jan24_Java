/*
 "Print character with second-highest frequency:
input: aakanksha
output: k->2"
 */
package gaurav_garg;

public class PrintCharacterWithSecondHighestFreaquency60 {

	int getcount(String str, char c) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == c) {
				count++;
			}
		}
		return count;
	}

	char printCharacterwithSecondHighestFrequency(String str) {
		str = str.toLowerCase();
		int max = 0;
		char c = '*';
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int getcount = getcount(str, ch);
			if (max < getcount) {
				max = getcount;
				c = ch;
			}
		}
		return c;
	}

	void nthfreaquencyfound(String str, int timeperiod) {
		char c = '*';
		int time = 0;
		if (timeperiod == 1) {
			c = printCharacterwithSecondHighestFrequency(str);
			time = getcount(str, c);
		} else {
			for (int i = 1; i < timeperiod; i++) {
				c = printCharacterwithSecondHighestFrequency(str);
				str = str.replace(String.valueOf(c), "");
				c = printCharacterwithSecondHighestFrequency(str);
				time = getcount(str, c);
			}
		}
		System.out.print(c + " -> " + time);
	}

	public static void main(String[] args) {
		new PrintCharacterWithSecondHighestFreaquency60().nthfreaquencyfound("aakankshah", 2);
	}
}
