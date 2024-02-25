package samiksha;

public class ReplaceDigitByStar {

	void printOutput() {
		String str = "H2i H3el4lo P4un2e5";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				str = str.replace(ch, '*');
			}
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		new ReplaceDigitByStar().printOutput();
	}
}
