package garima_s;

public class frequencyOfDigits {
	void printDigits(String value) {
		int count = 0;
		for (int index = 0; index < value.length(); index++) {
			char ch = value.charAt(index);
			boolean digit = Character.isDigit(ch);
			if (digit == true) {
				count++;
			}
		}
		System.out.println("Frequency of Digits in a String:" + count);
	}

	public static void main(String[] args) {
		new frequencyOfDigits().printDigits("te3c3hn5o2cre3dits");
	}
}