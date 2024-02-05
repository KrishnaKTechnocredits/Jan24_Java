package shafaque;

public class Characters {

	int getCharacterCount(String str, char targetCh)

	{
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == targetCh)
				count++;
		}

		return count;
	}

	void printFrequencyChar(String str) {
		int max = 0;
		char targetCh = '*';
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int count = getCharacterCount(str, ch);
			if (max < count) {
				max = count;
				targetCh = ch;
			}
		}
		if (max == 1) {
			System.out.println(str + " have all unique characters ");
		}

		else
			System.out.println(str + " -> " + targetCh + " -> " + max);

	}

	public static void main(String[] args) {
		Characters characters = new Characters();
		characters.printFrequencyChar("aakanksha");
		characters.printFrequencyChar("teecccchnoceredites");
		characters.printFrequencyChar("maulik");
	}
}
