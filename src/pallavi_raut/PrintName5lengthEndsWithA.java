/*Print all the names having length more than 5 characters, must end with 'a' or 'A' and should not have any digit.
String[] names = {"Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar"};
*/
package pallavi_raut;

public class PrintName5lengthEndsWithA {

	public static void main(String[] args) {
		String[] names = { "Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar" };
		PrintName5lengthEndsWithA printName5lengthEndsWithA = new PrintName5lengthEndsWithA();
		printName5lengthEndsWithA.printName(names);

	}

	void printName(String[] arr) {
		for (String str : arr) {
			char ch = str.charAt(str.length() - 1);
			boolean flag = checkIsDigitInString(str);
			if (str.length() > 5 && (ch == 'a' || ch == 'A') && flag == false) {
				System.out.println(str);
			}
		}
	}

	boolean checkIsDigitInString(String str) {

		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				flag = true;
		}
		return flag;
	}
}
