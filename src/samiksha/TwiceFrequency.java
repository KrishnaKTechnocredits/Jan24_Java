package samiksha;

public class TwiceFrequency {

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

	char printMaxFrequency(String str) {
		int max = 0;
		char maxChar = ' ';
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int count = getCharFrequency(str, ch);
			if (max < count) {
				max = count;
				maxChar = ch;
			}
		}
		return maxChar;
	}

	void printMaxFrequency() {
		String str = "teecccchhhnno";
		char maxChar = printMaxFrequency(str);

		for (int index = 0; index < str.length() - 1; index++) {
			str = str.replace(Character.toString(maxChar), "");
			maxChar = printMaxFrequency(str);
			char ch = str.charAt(index);
			int count = getCharFrequency(str, ch);
			if (count == 2) {
				System.out.println(maxChar);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("The characters occuring twice are ");
		new TwiceFrequency().printMaxFrequency();
	}
}
