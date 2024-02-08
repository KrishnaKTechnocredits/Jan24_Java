package ankita_s;

public class CharacterHavingMaxFreq {

	int getCharacterHavingMaxFreq(String Str, char ch) {
		int count = 0;
		for (int index = 0; index < Str.length(); index++) {
			char ch1 = Str.charAt(index);
			if (ch1 == ch) {
				count++;
			}
		}
		return count;
	}

	void printAllCharFrequ(String input) {
		int max = 0;
		char temp1 = ' ';
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int count = getCharacterHavingMaxFreq(input, ch);
			if (max < count) {
				max = count;
				temp1 = ch;
			}
		}
		if (max == 1) {
			System.out.println(input + " have all unique characters ");
		} else {
			System.out.println(input + ":" + temp1 + "->" + max);
		}
	}

	public static void main(String[] args) {
		CharacterHavingMaxFreq characterHavingMaxFreq = new CharacterHavingMaxFreq();
		characterHavingMaxFreq.printAllCharFrequ("aakanksha");
		characterHavingMaxFreq.printAllCharFrequ("teecccchnoceredites");
		characterHavingMaxFreq.printAllCharFrequ("maulik");
	}
}
