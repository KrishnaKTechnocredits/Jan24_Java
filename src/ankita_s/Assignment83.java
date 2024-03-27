package ankita_s;

public class Assignment83 {
	void printWordandCountOfSpecialCharString(String str) {
		String word = "";
		String specialCh = "";
		char[] chArr = str.toCharArray();
		for (int i = 0; i < chArr.length; i++) {
			if (chArr[i] == '_') {
				specialCh = specialCh + chArr[i];
			} else {
				if (specialCh.length() > 0) {
					System.out.println(word + "->" + specialCh.length());
					word = "";
					specialCh = "";
				}
				word = word + chArr[i];
			}
		}
		if (word.length() > 0)
			System.out.println(word + "->" + specialCh.length());
	}

	public static void main(String[] args) {
		new Assignment83().printWordandCountOfSpecialCharString("I__am___in_pune____");
	}
}
