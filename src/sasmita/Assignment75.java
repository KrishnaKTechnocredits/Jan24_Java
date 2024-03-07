/* Print all the names having length more than 5 characters, must end with 'a' or 'A' and should not have any digit.
String[] names = {"Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar"};

output : Samiksha 
 */
package sasmita;

public class Assignment75 {

	boolean isDigit(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch) == true) {
				return true;
			}
		}
		return false;
	}

	void getNameEndswitha(String[] arr) {
		String Finalname = "";
		for (String name : arr) {
			char lastCharacter = name.charAt(name.length() - 1);
			boolean flagisDigit = isDigit(name);
			if (name.length() > 5 && (lastCharacter == 'a' || lastCharacter == 'A') && !flagisDigit) {
				Finalname = name;
				System.out.println(Finalname);
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar" };

		new Assignment75().getNameEndswitha(names);
	}

}
