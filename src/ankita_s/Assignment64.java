package ankita_s;

public class Assignment64 {

	void specialCharAtEnd(String str) {
		String letters = "";
		String digits = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch) || Character.isLowerCase(ch) || Character.isDigit(ch)) {
				letters = letters + ch;
			} else {
				digits = digits + ch;
			}
		}
		System.out.println("special characters at the end : " + letters + digits);
	}

	public static void main(String[] args) {
		String input = "-AasH?3v7i!";
		Assignment64 ass64 = new Assignment64();
		ass64.specialCharAtEnd(input);
	}
}
