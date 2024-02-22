/*input : "H5el6lo Hi Tech3noc2redits Pu1ne" sum all Digits should be at Start and then right alignment.
 * output : 
  		  Hello
  		     Hi
  Technocredits
 		   Pune
 		     16
 			*/
package rupali_umagol;

public class Assignment72 {
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

	String[] getDigitFirst(String str) {
		String output = "";
		int sum = 0;
		String[] arr = new String[2];
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum += Character.getNumericValue(str.charAt(i));
			} else
				output += str.charAt(i);
		}
		arr[0] = output;
		arr[1] = sum + "";
		return arr;

	}

	void displayStringWithSumOfDigitAtEnd(String[] str) {
		String resultString = "";
		int total = 0;
		int count = getMaxLengthCount(str);
		for (int i = 0; i < str.length; i++) {
			String[] input = getDigitFirst(str[i]);
			String output = input[0];
			total = total + Integer.parseInt(input[1]);
			resultString = getStringWithRightAligned(output, count);
			System.out.println(resultString);
		}
		String reult = getStringWithRightAligned(total + "", count);
		System.out.println(reult);
	}

	public static void main(String[] args) {

		String input = "H5el6lo Hi Tech3noc2redits Pu1ne";
		String[] input1 = input.split(" ");
		new Assignment72().displayStringWithSumOfDigitAtEnd(input1);
	}
}
