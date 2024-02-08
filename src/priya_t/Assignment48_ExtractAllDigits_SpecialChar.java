package priya_t;

public class Assignment48_ExtractAllDigits_SpecialChar {
	String getDigitAndSpecialChar(String str) {
		String result = "";
		str = str.toLowerCase();
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch) || !Character.isLowerCase(ch)) {
				result = result + ch;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Assignment48_ExtractAllDigits_SpecialChar obj = new Assignment48_ExtractAllDigits_SpecialChar();
		String ans = obj.getDigitAndSpecialChar("Aas-H3v7i");
		System.out.println(ans);
	}
}