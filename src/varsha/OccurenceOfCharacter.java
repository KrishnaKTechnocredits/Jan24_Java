package varsha;

//Print only characters occurring exactly twice:
//input: teecccchhhnno;
//output: en"

class OccurenceOfCharacter {

	int getCountOfChar(String input, char character) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == character) {
				count++;
			}
		}
		return count;
	}

	void printCharacterHavingCount2(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int Count = getCountOfChar(input, ch);
			if (Count == 2 && ch != '*') {
				System.out.print(ch);
				input = input.replace(ch, '*');
			}
		}
	}

	public static void main(String[] args) {
		OccurenceOfCharacter occurenceOfCharacter = new OccurenceOfCharacter();
		occurenceOfCharacter.printCharacterHavingCount2("teecccchhhnno");
	}
}