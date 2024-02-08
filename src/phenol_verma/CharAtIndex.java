package phenol_verma;

public class CharAtIndex {
	int count = 0;

	int countChar(String str) {
		for (int index = 0; index < str.length(); index++) {
			char currentChar = str.charAt(index);
			if (Character.isDigit(currentChar))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		CharAtIndex charAtIndex = new CharAtIndex();
		System.out.println("Digits in string " + charAtIndex.countChar("te3c3hn5o2cre3dits"));
	}
}
