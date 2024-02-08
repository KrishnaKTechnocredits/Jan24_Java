package lovekesh_mishra;

class ExtractingDigitsAssignmentNumber48 {

	void getDigit(String input) {

		String specialCharacterString = "";
		String digit = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch) == true)
				digit = digit + ch;
			else if (Character.isLowerCase(ch) == false && Character.isUpperCase(ch) == false)
				specialCharacterString = specialCharacterString + ch;
		}
		System.out.print("output is ----> "+specialCharacterString + digit);
	}

	public static void main(String[] args) {
		ExtractingDigitsAssignmentNumber48 ans = new ExtractingDigitsAssignmentNumber48();
		ans.getDigit("Aas-H3v7i");
	}
}
