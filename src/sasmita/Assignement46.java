package sasmita;

public class Assignement46 {
	void getDigitUpperLowerString(String str) {
		String uppercase = "";
		String lowercase = "";
		String digit = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				digit = digit + ch;
			else if (Character.isUpperCase(ch))
				uppercase = uppercase + ch;
			else
				lowercase = lowercase + ch;
		}
		String ans = digit + uppercase + lowercase;
		System.out.println(ans);
	

	}

	public static void main(String[] args) {
		new Assignement46().getDigitUpperLowerString("AasH3v7i");

	}
}
