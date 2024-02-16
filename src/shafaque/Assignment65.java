package shafaque;

public class Assignment65 {
	void removeDigitsAndWhitespaces(String str) {
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isDigit(ch) && !(str.charAt(i) == ' ')) {
				output = output + ch;
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		String input = "H2i H3el4lo P4un2e5";
		new Assignment65().removeDigitsAndWhitespaces(input);
	}

}
