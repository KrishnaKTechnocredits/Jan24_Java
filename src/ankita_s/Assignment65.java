package ankita_s;

public class Assignment65 {

	void removeDigitsAndWhitespaces(String str) {
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean digits = Character.isDigit(ch);
			boolean space = str.charAt(i) == ' ';
			if (digits!=true && space!=true) {
				output = output + ch;
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		String input = "H2i H3el4lo P4un2e5";
		Assignment65 ass65 = new Assignment65();
		ass65.removeDigitsAndWhitespaces(input);
	}

}
