package garima_s;

public class CountUnderscore {

	void countUnderScore(String str) {
		str = str + "x";
		int count = 0;
		String Word = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isAlphabetic(ch)) {
				Word += ch + "";
			} else if (ch == '_' && (Character.isAlphabetic(str.charAt(i + 1)))) {
				count++;
				System.out.println(Word + "->" + count);
				Word = "";
				count = 0;
			} else if (ch == '_') {
				count++;
			}
		}
	}

	public static void main(String[] args) {
		String str = "I__am___in_Pune____";
		new CountUnderscore().countUnderScore(str);
	}
}
