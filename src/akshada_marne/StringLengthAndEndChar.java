package akshada_marne;

public class StringLengthAndEndChar {

	boolean ReturnIsDigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch))
				return true;
		}
		return false;

	}

	void display(String[] arr) {
		for (String str: arr) {
			boolean flag = ReturnIsDigit(str);

			char lastLetter = str.charAt(str.length() - 1);
			int len = str.length();
			if (len > 5 && (lastLetter == 'a' || lastLetter == 'A') && flag == false) {
				System.out.println(str);
			}
		}

	}

	public static void main(String args[]) {
		StringLengthAndEndChar stringLengthAndEndChar = new StringLengthAndEndChar();
		String[] names = { "Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar" };
		stringLengthAndEndChar.display(names);

	}

}
