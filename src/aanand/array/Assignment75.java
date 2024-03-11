package aanand.array;

/*Print all the names having length more than 5 characters, must end with 'a' or 'A' and should not have any digit.
String[] names = {"Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar"};

output : Samiksha */

public class Assignment75 {

	boolean isDigit(String str) {
		boolean digitFlag = false;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				digitFlag = true;
			}
		}
		return digitFlag;
	}

	void getNamesFromStringMoreThan5Char(String[] arr) {

		for (String name : arr) {
			char ch = name.charAt(name.length() - 1);
			boolean digitFlag = isDigit(name);
			if (name.length() > 5 && (ch == 'a' || ch == 'A') && digitFlag == false) {
				System.out.println(name);
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar" };
		new Assignment75().getNamesFromStringMoreThan5Char(names);
	}
}