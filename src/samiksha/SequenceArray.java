package samiksha;

public class SequenceArray {

	void printSequence(String str) {
		String digitStr = "";
		String upperStr = "";
		String lowerStr = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				digitStr += Character.getNumericValue(ch);
			} else if (Character.isUpperCase(ch)) {
				upperStr += ch;
			} else if (Character.isLowerCase(ch)) {
				lowerStr += ch;
			}
		}
		String output = digitStr + upperStr + lowerStr;
		System.out.println(output);
	}

	public static void main(String[] args) {
		new SequenceArray().printSequence("AasH3v7i");
	}
}
