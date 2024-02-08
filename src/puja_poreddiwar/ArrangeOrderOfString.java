//Assignment - 46 : 4th Feb'2024
package puja_poreddiwar;

public class ArrangeOrderOfString {

	String printStringArrange(String str) {
		String upperCaseStr = "";
		String lowerCaseStr = "";
		String digitStr = "";
		String ans = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				digitStr = digitStr + ch;
			} else if (Character.isUpperCase(ch)) {
				upperCaseStr = upperCaseStr + ch;
			} else if (Character.isLowerCase(ch)) {
				lowerCaseStr = lowerCaseStr + ch;
			}
			ans = digitStr + upperCaseStr + lowerCaseStr;
		}
		System.out.println(ans);
		return ans;
	}

	public static void main(String[] args) {
		new ArrangeOrderOfString().printStringArrange("AasH3v7i");

	}
}
