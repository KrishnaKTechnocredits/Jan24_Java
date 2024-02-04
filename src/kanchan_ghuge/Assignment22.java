package kanchan_ghuge;

public class Assignment22 {
	int count = 0;

	int getCountDigits() {
		String input = "te3c3hn5o2cre3dits";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println("Total numbers of digits in String = " + count);
		return count;
	}

	public static void main(String[] args) {
		new Assignment22().getCountDigits();
	}
}