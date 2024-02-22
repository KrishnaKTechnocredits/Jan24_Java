/*input : "H5el2lo Hi Tech3noc2redits Pu1ne" sum all Digits should be at Start and then right alignment.
 * output : 
  		  7Hello
  			   0Hi
  5Technocredits
 			1Pune
 			*/
package rupali_umagol;

public class Assignment71 {

	int getMaxLengthCount(String[] input) {
		int maxCount = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() > maxCount) {
				maxCount = input[i].length();
			}
		}
		return maxCount;
	}

	String getStringWithRightAligned(String str, int count) {
		String output = "";
		int requiredSpaces = count - str.length();
		for (int i = 0; i < requiredSpaces; i++) {
			output = output + " ";
		}
		return output + str;

	}

	String getDigitFirst(String str) {
		String output = "";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum += Character.getNumericValue(str.charAt(i));
			} else
				output += str.charAt(i);
		}
		return sum + output;

	}

	void displayStringWithDigitFirst(String[] str) {
		String resultString = "";
		int count = getMaxLengthCount(str);
		for (int i = 0; i < str.length; i++) {

			resultString = getStringWithRightAligned(getDigitFirst(str[i]), count);
			System.out.println(resultString);
		}
	}

	public static void main(String[] args) {

		String input = "H5el2lo Hi Tech3noc2redits Pu1ne";
		String[] input1 = input.split(" ");
		new Assignment71().displayStringWithDigitFirst(input1);
	}
}
