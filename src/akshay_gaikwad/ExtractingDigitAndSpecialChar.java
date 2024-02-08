package akshay_gaikwad;

public class ExtractingDigitAndSpecialChar {
	String getDigitAndSpecialCharFromStr(String str) {
		String output = "";
		str = str.toLowerCase();
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch) || !Character.isLowerCase(ch)) {
				output += ch;
			}
		}
		return output;
	}
	public static void main(String[] args) {
		
		System.out.println(new ExtractingDigitAndSpecialChar().getDigitAndSpecialCharFromStr("Aas-H3v7i"));
	}
}
