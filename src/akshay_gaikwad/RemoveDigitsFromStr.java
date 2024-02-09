package akshay_gaikwad;

public class RemoveDigitsFromStr {
	String removeDigitsFromStr(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (!Character.isDigit(ch)) {
				output += ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		System.out.println(new RemoveDigitsFromStr().removeDigitsFromStr("H2i H3el4lo P4un2e5"));
	}
}
