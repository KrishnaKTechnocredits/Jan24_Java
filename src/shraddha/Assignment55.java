package shraddha;

/*
 Print only characters occurring exactly twice:
input: teecccchhhnno;
output: en"
 */
public class Assignment55 {

	int getCount(String str, char c) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == c) {
				count++;
			}
		}
		return count;
	}

	void printCharacterOccurringTwice(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int getCount = getCount(str, ch);
			if (getCount == 2) {
				if (str.indexOf(ch) == i) {
					System.out.print(ch);
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment55 character = new Assignment55();
		character.printCharacterOccurringTwice("teecccchhhnno");
		}
}
