package gaurav_garg;

public class RearrangeStringDigitUppercaseLowercaseAssigment46 {

	void rearrangeString(String str) {
		String upperCaseStr = "";
		String lowerCaseStr = "";
		String digitStr = "";
		for (int stringindex = 0; stringindex < str.length(); stringindex++) {
			char c = str.charAt(stringindex);
			if (Character.isUpperCase(c) == true)
				upperCaseStr = upperCaseStr + c;
			else if (Character.isLowerCase(c) == true)
				lowerCaseStr = lowerCaseStr + c;
			else if (Character.isDigit(c) == true)
				digitStr = digitStr + c;
		}
		System.out.print(digitStr + upperCaseStr + lowerCaseStr);
	}

	public static void main(String[] args) {
		new RearrangeStringDigitUppercaseLowercaseAssigment46().rearrangeString("AasH3v7i");

	}
}
