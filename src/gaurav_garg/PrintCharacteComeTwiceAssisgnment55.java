/*
 Print only characters occurring exactly twice:
input: teecccchhhnno;
output: en"
 */
package gaurav_garg;

public class PrintCharacteComeTwiceAssisgnment55 {

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

	void printCharacterComeTwice(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int getcount = getcount(str, ch);
			if (getcount == 2) {
				if (str.indexOf(ch) == index) {
					System.out.print(ch);
				}
			}
		}
	}

	public static void main(String[] args) {
		new PrintCharacteComeTwiceAssisgnment55().printCharacterComeTwice("teecccchhhnno");
	}
}
