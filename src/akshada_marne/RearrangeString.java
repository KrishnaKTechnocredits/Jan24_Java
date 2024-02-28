package akshada_marne;


public class RearrangeString {

	String digit = "", uppercase = "", lowercase = "", displayStr;

	String printDigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch))
				digit = digit + Character.getNumericValue(ch);
		}
		return digit;
	}

	String printUpperCase(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch))
				uppercase = uppercase + ch;
		}
		return uppercase;
	}

	String printLowerCase(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLowerCase(ch))
				lowercase = lowercase + ch;

		}
		return lowercase;
	}

	void rearrange(String str) {
		String digit = printDigit(str);
		String uppercase = printUpperCase(str);
		String lowercase = printLowerCase(str);

		System.out.print(digit + uppercase + lowercase);

	}

	public static void main(String args[]) {
		RearrangeString rearrangeString = new RearrangeString();
		rearrangeString.rearrange("AasH3v7i");

	}
}

