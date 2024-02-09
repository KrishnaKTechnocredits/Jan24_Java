package samiksha;

public class RemoveDigitFromString {

	void printOutput(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (!Character.isDigit(ch)) {
				output = output + ch;
			}
		}System.out.print(output);
	}

	public static void main(String[] args) {
		new RemoveDigitFromString().printOutput("H2i H3el4lo P4un2e5");
	}
}
