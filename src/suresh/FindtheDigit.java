package suresh;

public class FindtheDigit {
	void findDigit(String input) {
		int count = 0;
		for (int i = 0; i <= input.length() - 1; i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println("the digits present in the word is " +count);
	}

	public static void main(String[] args) {
		FindtheDigit findtheDigit = new FindtheDigit();
		findtheDigit.findDigit("te3c3hn5o2cre3dits");
	}
}
