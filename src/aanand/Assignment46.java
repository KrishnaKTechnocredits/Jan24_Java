package aanand;

public class Assignment46 {

	static String reArrangeString(String str) {

		String upperCaseStr = "", lowerCaseStr = "";
		String digitStr = "", ans = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				digitStr = digitStr + ch;
			} else if (Character.isLowerCase(ch)) {
				lowerCaseStr = lowerCaseStr + ch;
			} else if (Character.isUpperCase(ch)) {
				upperCaseStr = upperCaseStr + ch;
			}
		}
		return digitStr + upperCaseStr + lowerCaseStr;
	}

	static void print(String str) {
		String ans = reArrangeString(str);
		System.out.println(ans);
	}

	public static void main(String[] args) {
		print("AasH3v7i");
	}
}