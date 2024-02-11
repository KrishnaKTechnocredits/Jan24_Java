//Assignment - 46 : 4th Feb'2024
//Rearrange a string in a way having all digits first followed by Uppercase followed by lowercase.
// 
//input :-AasH3v7i
//output:-37AHsvi

package prathamesh_tati.array;

public class RearrangeString {

	String outputDigit = "";
	String outputUpper = "";
	String outputLower = "";

	void arrangeStringWithDigitsAndChars(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				outputDigit = outputDigit + ch;
			} else if (Character.isUpperCase(ch))
				outputUpper = outputUpper + ch;
			else if (Character.isLowerCase(ch))
				outputLower = outputLower + ch;
		}
		System.out.println(outputDigit + outputUpper + outputLower);
	}

	public static void main(String[] args) {
		RearrangeString rearrangeString = new RearrangeString();
		String input = "AasH3v7i";
		rearrangeString.arrangeStringWithDigitsAndChars(input);
	}
}