package shraddha;

public class Assignment_75 {

	boolean nameHaveDigit(String name) {
		for (int i = 0; i < name.length(); i++) {
			if (Character.isDigit(name.charAt(i)))
				return true;
		}
		return false;
	}

	void nameLength(String[] arr) {

		for (String name : arr) {
			char lastChar = name.charAt(name.length() - 1);
			boolean digit = nameHaveDigit(name);
			if (name.length() > 5 && (lastChar == 'a' || lastChar == 'A') && !digit) {
				System.out.println(name);
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar" };
		Assignment_75 assignment_75 = new Assignment_75();
		assignment_75.nameLength(names);
	}
}
