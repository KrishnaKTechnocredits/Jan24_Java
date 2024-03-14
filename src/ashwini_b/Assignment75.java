package ashwini_b;

/*
Assignment - 75 : 7th March'2024
Print all the names having length more than 5 characters, must end with 'a' or 'A' and
 should not have any digit.
String[] names = {"Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar"};

output : Samiksha
 */
public class Assignment75 {

	void printEligibleNames(String[] inputArray) {
		for (int index = 0; index < inputArray.length; index++) {
			String str = inputArray[index];
			// check for length is more than 5 characters
			if (str.length() > 5) {
				// Check for string end with a and A
				char ch = str.charAt(str.length() - 1);
				if (ch == 'a' || ch == 'A') {
					// check for digit
					if(!containsDigit(str)) {
						System.out.println(str);
					}

				}
			}
		}
	}

	// check if string contains a digit
	boolean containsDigit(String str) {
		boolean containDigitFlag = false;
		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			if (Character.isDigit(ch1)) {
				containDigitFlag = true;
			}
		}
		return containDigitFlag;
	}

	public static void main(String[] args) {
		String[] names = { "Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar" };
		Assignment75 assignment75 = new Assignment75();
		assignment75.printEligibleNames(names);

	}

}
