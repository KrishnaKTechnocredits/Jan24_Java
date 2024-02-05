package akshay_gaikwad;

public class ExtractAllDigitsFromStr {
	void printStrAllDigits(String str) {
		String digitStr = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				digitStr += ch;
			}
		}
		System.out.println("Digits in given string are : " + digitStr);
	}
	
	public static void main(String[] args) {
		new ExtractAllDigitsFromStr().printStrAllDigits("-Aas-H3v7i");
	}
}
