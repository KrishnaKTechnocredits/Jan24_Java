package lovekesh_mishra;

class ReArrangeAssignment46 {

	void Arrange(String input) {
		String upperCaseString = "";
		String lowerCaseString = "";
		String DigitString = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				DigitString = DigitString + ch;
			} else if (Character.isUpperCase(ch)) {
				upperCaseString = upperCaseString + ch;
			} else if (Character.isLowerCase(ch)) {
				lowerCaseString = lowerCaseString + ch;
			}
		}
		System.out.println(DigitString + upperCaseString + lowerCaseString);

	}

	public static void main(String[] args) {
		ReArrangeAssignment46 ans = new ReArrangeAssignment46();
		ans.Arrange("AasH3v7i");
	}

}