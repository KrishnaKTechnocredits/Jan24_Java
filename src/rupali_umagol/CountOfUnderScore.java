package rupali_umagol;

public class CountOfUnderScore {
	void countUnderScore(String str) {
		str = str + "a";
		int count = 0;
		String firstWord = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isAlphabetic(ch)) {
				firstWord += ch + "";

			} else if (ch == '_' && (Character.isAlphabetic(str.charAt(i + 1)))) {
				count++;
				System.out.println(firstWord + "->" + count);
				firstWord = "";
				count = 0;
			} else if (ch == '_') {
				count++;
			}
		}
	}

	public static void main(String[] args) {
		String str = "I__am___in_pune____";
		new CountOfUnderScore().countUnderScore(str);
	}
}
