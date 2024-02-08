package garima_s;

public class FindCharacterMaxCount {
	int getCharacterCount(String value, char targetCh) {
		int count = 0;
		for (int index = 0; index < value.length(); index++) {
			char ch = value.charAt(index);
			if (ch == targetCh) {
				count++;
			}
		}
		return count;
	}

	void printMaxCharacterCount(String input) {
		int max = 0;
		int chCount = 0;
		char targetCh = ' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			chCount = getCharacterCount(input, ch);
			if (max < chCount) {
				max = chCount;
				targetCh = ch;
			}
		}
		if (max == 1) {
			System.out.println(input + " having all unique characters");
		} else {
			System.out.println(input + " - "+ targetCh +" -> " + max);
		}
	}

	public static void main(String[] args) {
		FindCharacterMaxCount findCharacterMaxCount = new FindCharacterMaxCount();
		findCharacterMaxCount.printMaxCharacterCount("aakansha");
		findCharacterMaxCount.printMaxCharacterCount("teecccchnoceredites");
		findCharacterMaxCount.printMaxCharacterCount("maulik");
	}
}
