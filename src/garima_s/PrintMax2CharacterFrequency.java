/*Print only characters occurring exactly twice:
input: teecccchhhnno;
output: en
*/

package garima_s;

class PrintMax2CharacterFrequency {
	int count2Characters(String input, char targetChar) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == targetChar) {
				count++;
			}
		}
		return count;
	}

	void printCharacter(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (isCharMax2(input, ch, index)) {
				int chCount = count2Characters(input, ch);
				if (chCount == 2)
					System.out.print(ch);
			}
		}
	}

	boolean isCharMax2(String input, char targetChar, int count) {
		for (int index = 0; index < count; index++) {
			if (input.charAt(index) == targetChar) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String input = "teecccchhhnno";
		System.out.print("Characters have Maximum 2 Frequency : ");
		new PrintMax2CharacterFrequency().printCharacter(input);
	}

}
