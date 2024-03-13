package shramika_vaidya;

public class NamesHavingLengthMoreThan5andEndsWithA {

	boolean isDigitPresent(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				return true;
			}
		}
		return false;
	}

	String[] getNamesHavingLengthMoreThan5(String[] input) {
		for (int i = 0; i < input.length; i++) {
			int len = input[i].length();
			boolean flag = isDigitPresent(input[i]);
			if (len > 5 && (flag == false) && (input[i].charAt(len - 1) == 'A' || input[i].charAt(len - 1) == 'a')) {
				System.out.println(input[i]);
			}
		}
		return input;
	}

	public static void main(String[] args) {
		String[] names = { "Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar" };
		new NamesHavingLengthMoreThan5andEndsWithA().getNamesHavingLengthMoreThan5(names);
	}
}
