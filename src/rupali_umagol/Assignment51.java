package rupali_umagol;

public class Assignment51 {
	String removeDigitFromString(String str) {
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isDigit(ch)) {
				str1 = str1 + ch;
			}
		}
		return str1;
	}

	public static void main(String[] args) {
		Assignment51 assignment51 = new Assignment51();
		String str = "H2i H3el4lo P4un2e5";
		String output = assignment51.removeDigitFromString(str);
		System.out.println(output);
	}
}