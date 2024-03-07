package ankita_s;

public class Assignment75 {
	boolean isContainDigit(String name) {
		for (int i = 0; i < name.length(); i++) {
			if (Character.isDigit(name.charAt(i)))
				return true;
		}
		return false;
	}

	void NamesLenMoreThanFive(String[] arr) {

		for (String name : arr) {
			char lastChar = name.charAt(name.length() - 1);
			boolean digit = isContainDigit(name);
			if (name.length() > 5 && (lastChar == 'a' || lastChar == 'A') && !digit) {
				System.out.println(name);
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar" };
		Assignment75 ass75 = new Assignment75();
		ass75.NamesLenMoreThanFive(names);
	}
}
