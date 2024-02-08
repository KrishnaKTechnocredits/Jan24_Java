package nisarg_patel;

public class Assignment30FindCharcterMaxFrequency {

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
			System.out.println(input + " - " + targetCh + " -> " + max);
		}
	}

	public static void main(String[] args) {
		Assignment30FindCharcterMaxFrequency assignment30FindCharcterMaxFrequency = new Assignment30FindCharcterMaxFrequency();
		assignment30FindCharcterMaxFrequency.printMaxCharacterCount("aakansha");
		assignment30FindCharcterMaxFrequency.printMaxCharacterCount("teecccchnoceredites");
		assignment30FindCharcterMaxFrequency.printMaxCharacterCount("maulik");
	}
}
