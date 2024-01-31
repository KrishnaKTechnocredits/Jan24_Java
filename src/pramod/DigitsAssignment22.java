package pramod;

class DigitsAssignment22 {

	void Digits(String input) {
		int count = 0;

		for (int index = 0; index < input.length(); index++) {

			char ch = input.charAt(index);
			boolean isflag = Character.isDigit(ch);
			if (isflag == true) {
				count++;
			}

		}
		System.out.println("total digits in input are " + count);
	}

	public static void main(String[] args) {
		DigitsAssignment22 digitsAssignment22 = new DigitsAssignment22();
		digitsAssignment22.Digits("te3c3hn5o2cre3dits");
	}
}
