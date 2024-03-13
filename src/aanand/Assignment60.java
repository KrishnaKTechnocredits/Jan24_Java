package aanand;

/*Print character with second-highest frequency:
input: aakanksha
output: k->2*/

public class Assignment60 {
	int findCharMaxFerqInString(String str, char ch) {
		str = str.toLowerCase();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char freq = str.charAt(i);
			if (freq == ch) {
				count++;
			}
		}
		return count;
	}

	char maxCharFreq(String str) {
		int maxCount = 0;
		char maxChar = ' ';
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int count = findCharMaxFerqInString(str, ch);
			if (maxCount < count) {
				maxCount = count;
				maxChar = ch;
			}
		}
		return maxChar;
	}

	void secondMax(String input) {

		char ch = maxCharFreq(input);
		input = input.replace(Character.toString(ch), "");
		ch = maxCharFreq(input);

		System.out.println("Second Max Frequent Char " + ch + " -> " + findCharMaxFerqInString(input, ch));
	}

	public static void main(String[] args) {
		new Assignment60().secondMax("aakanksha");
	}
}
