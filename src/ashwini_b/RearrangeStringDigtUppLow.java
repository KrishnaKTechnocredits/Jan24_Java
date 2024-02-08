package ashwini_b;

/*
Assignment - 46 : 4th Feb'2024
Rearrange a string in a way having all digits first followed by Uppercase followed by lowercase.
input :-AasH3v7i
output:-37AHsvi

hint
String upperCaseStr = "";
String lowerCaseStr = "";
String digitStr = "";

if(Character.isDigit(ch))
	digitStr = digitStr + ch;
else if(Character.isUpperCase(ch))
	str1 = str1 + ch;

String ans = digitStr+upperCaseStr+lowerCaseStr;
return ans;
 */
public class RearrangeStringDigtUppLow {
	String printName(String input) {
		String upperCaseStr = "";
		String lowerCaseStr = "";
		String digitStr = "";

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				digitStr = digitStr + ch;
				// System.out.println(ch);
			} else if (Character.isUpperCase(ch)) {
				upperCaseStr = upperCaseStr + ch;
				// System.out.println(ch);
			} else if (Character.isLowerCase(ch)) {
				lowerCaseStr = lowerCaseStr + ch;
				// System.out.println(ch);
			}
		}
		String ans = digitStr + upperCaseStr + lowerCaseStr;
		return ans;
	}

	public static void main(String[] args) {
		RearrangeStringDigtUppLow rearrangeStringDigtUppLow = new RearrangeStringDigtUppLow();
		String ans = rearrangeStringDigtUppLow.printName("AasH3v7i");
		System.out.println(ans);
	}
}
