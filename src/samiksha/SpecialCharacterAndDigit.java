package samiksha;

public class SpecialCharacterAndDigit {

	String printString(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (!Character.isUpperCase(ch) && !Character.isLowerCase(ch)) {
				output = output + ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String output =new SpecialCharacterAndDigit().printString("Aas-H3v7i");
		System.out.println(output);
	}
}
