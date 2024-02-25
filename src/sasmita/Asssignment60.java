package sasmita;

public class Asssignment60 {
	int getCharFreq(String str, char targetCharacter) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.toLowerCase(str.charAt(index)) == targetCharacter) {
				count++;
			}
		}
		return count;
	}

	char printAllcharFreq(String input) {
		int max = 0;
		char targetCharacter = ' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = Character.toLowerCase(input.charAt(index));
			int count = getCharFreq(input, ch);
			if (max < count) {
				max = count;
				targetCharacter = ch;
			}
		}

		return targetCharacter;

	}

	public static void main(String[] args) {
		Asssignment60 asssignment60 = new Asssignment60();
		String input = "aakanksha";
		char ch = asssignment60.printAllcharFreq(input);
		input = input.replace(Character.toString(ch), "");
		ch = asssignment60.printAllcharFreq(input);
		int count = asssignment60.getCharFreq(input, ch);
		System.out.println(ch + "-->" + count);

	}

}
