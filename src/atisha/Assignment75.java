//Print all the names having length more than 5 characters, must end with 'a' or 'A' and should not have any digit.
//String[] names = {"Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar"}; //output : Samiksha

package atisha;

public class Assignment75 {
	public static void main(String[] args) {
		String[] names = { "Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar" };
		new Assignment75().getName(names);

	}

	void getName(String[] names) {

		for (String str : names) {

			boolean ans = isDigit(str);
			char ch = str.charAt(str.length() - 1);
			if (str.length() > 5 && (ans == false) && (ch == 'a' || ch == 'A'))
				System.out.println(str);

		}
	}

	boolean isDigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch))
				return true;
		}

		return false;
	}
}