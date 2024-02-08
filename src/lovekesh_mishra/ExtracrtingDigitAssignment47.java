package lovekesh_mishra;

class ExtracrtingDigitAssignment47 {

	String getDigit(String input) {
		String digit = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch))
				digit = digit + ch;
		}
		System.out.println("Digit's are---> " + digit);
		return digit;

	}

	public static void main(String[] args) {
		ExtracrtingDigitAssignment47 ans = new ExtracrtingDigitAssignment47();
		ans.getDigit("Aas-H3v7i");

	}
}