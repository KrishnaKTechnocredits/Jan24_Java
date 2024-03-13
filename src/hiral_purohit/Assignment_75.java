package hiral_purohit;

public class Assignment_75 {

	boolean isStringDigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				return true;
			}
		}
		return false;
	}

	void toPrintString(String[] arr) {
		for (String name : arr) {
			char lastChar = name.charAt(name.length() - 1);
			boolean isDigit = isStringDigit(name);
			if (name.length() > 5 && (lastChar == 'A' || lastChar == 'a') && !isDigit) {
				System.out.println(name);
			}

		}
	}

	public static void main(String[] args) {
		String[] names = { "Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar" };
		new Assignment_75().toPrintString(names);
	}

}
