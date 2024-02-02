package akshay_gaikwad;

public class NonRepeatLastConsonants {
	char getLastRepeatletter(String str) {
		char lastCh = ' ';
		for (int index = (str.length() - 1); index >= 0; index--) {
			char ch = str.charAt(index);
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				if (str.lastIndexOf(ch) == str.indexOf(ch)) {
					lastCh = ch;
					break;
				}
			}
		}
		if (lastCh == ' ') {
			System.out.println("No repeatative consonant found in given string");
			return lastCh;
		} else {
			return lastCh;
		}
	}

	public static void main(String[] args) {
		System.out.println(new NonRepeatLastConsonants().getLastRepeatletter("aakanksha"));
	}
}
