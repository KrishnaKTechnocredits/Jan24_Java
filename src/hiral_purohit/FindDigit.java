package hiral_purohit;

public class FindDigit {

	int count = 0;

	void findDigitCount(String str) {

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println("Digits in String: " + count);
	}

	public static void main(String[] args) {
		FindDigit findDigit = new FindDigit();
		findDigit.findDigitCount("te3c3hn5o2cre3dits");
	}
}
