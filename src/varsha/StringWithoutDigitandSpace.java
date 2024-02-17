package varsha;

//Remove digits and whitespace characters:
//input: H2i H3el4lo P4un2e5
//output: HiHelloPune

public class StringWithoutDigitandSpace {

	String getString(String input) {
		char ch = ' ';
		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			if (Character.isDigit(ch) || ch == ' ')
				input = input.replace(ch, '*');
		}
		input = input.replace(String.valueOf('*'), "");
		return input;
	}

	public static void main(String[] args) {
		String output = new StringWithoutDigitandSpace().getString("H2i H3el4lo P4un2e5");
		System.out.println(output);
	}
}
