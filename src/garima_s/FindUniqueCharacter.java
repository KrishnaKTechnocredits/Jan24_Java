package garima_s;

public class FindUniqueCharacter {

	int getUniqueCharacter(String value, char targetCharacter) {
		int count = 0;
		for (int index = 0; index < value.length(); index++) {
			char ch = value.charAt(index);
			if (ch == targetCharacter) {
				count++;
			}
		}
		return count;
	}

	void printCharacter(String value) {
		for (int index = 0; index < value.length(); index++) {
			char ch = value.charAt(index);
			int chCount = getUniqueCharacter(value, ch);
			if (chCount == 1) {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		System.out.print("Unique characters : ");
		new FindUniqueCharacter().printCharacter("technocredits");
	}
}