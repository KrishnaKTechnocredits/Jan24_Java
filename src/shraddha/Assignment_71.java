package shraddha;

public class Assignment_71 {

	int getMaxCount(String[] input) {
		int maxCount = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() > maxCount) {
				maxCount = input[i].length();
			}
		}
		return maxCount;
	}

	String stringRightAligned(String str, int count) {
		String output = "";
		int requiredSpace = count - str.length();
		for (int i = 0; i < requiredSpace; i++) {
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
		String outputString = "";
		int count = getMaxCount(str);
		for (int i = 0; i < str.length; i++) {

			outputString = stringRightAligned(getDigitFirst(str[i]), count);
			System.out.println(outputString);
		}
	}

	public static void main(String[] args) {
		
		Assignment_71 assignment_71 = new Assignment_71();
		String input = "H5el2lo Hi Tech3noc2redits Pu1ne";
		String[] input1 = input.split(" ");
		assignment_71.displayStringWithDigitFirst(input1);
	}
}
