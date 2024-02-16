package shafaque;

public class Assignment66 {
	void replaceDigitsWithSymbol(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				str = str.replace(str.charAt(i), '*');
			}
		}

		System.out.println(str);
	}

	public static void main(String[] args) {

		String input = "H2i H3el4lo P4un2e5";
		new Assignment66().replaceDigitsWithSymbol(input);
	}

}


