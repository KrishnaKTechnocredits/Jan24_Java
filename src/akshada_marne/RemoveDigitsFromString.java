package akshada_marne;

public class RemoveDigitsFromString {

	void remove(String str) {
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (!Character.isDigit(ch)) {
				output = output + ch;
			}

		}
		System.out.println(output);
	}

	public static void main(String args[]) {
		RemoveDigitsFromString removeDigitsFromString = new RemoveDigitsFromString();
		removeDigitsFromString.remove("H2i H3el4lo P4un2e5");
	}
}
