package varsha.AssignmentOn4;

//Assignment - 46 : 4th Feb'2024
//Rearrange a string in a way having all digits first followed by Uppercase followed by lowercase.
//input :-AasH3v7i
//output:-37AHsvi

public class ArrayEx15 {

	String upperCaseStr = "";
	String lowerCaseStr = "";
	String digitStr = "";

	String getString(String input) {
		String ans = null;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				digitStr = digitStr + Character.getNumericValue(ch);
			} else if (Character.isUpperCase(ch)) {
				upperCaseStr = upperCaseStr + ch;
			} else {
				lowerCaseStr = lowerCaseStr + ch;
			}
		}
		ans = digitStr + upperCaseStr + lowerCaseStr;
		return ans;
	}

	public static void main(String[] args) {
		ArrayEx15 arrayEx15 = new ArrayEx15();
		String input = arrayEx15.getString("AasH3v7i");
		System.out.println(input);
	}
}
