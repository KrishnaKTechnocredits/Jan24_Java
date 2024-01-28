package gaurav_garg;

public class FIndCountDigitInStringAssignment22 {
	int count;

	void printDigitInString(String string1) {
		for (int i = 0; i < string1.length(); i++) {
			char ch = string1.charAt(i);
			boolean ans = Character.isDigit(ch);

			if (ans == true) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		new FIndCountDigitInStringAssignment22().printDigitInString("te3c3hn5o2cre3dits");
	}
}
