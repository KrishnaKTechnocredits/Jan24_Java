package samiksha;

public class AlignLastDigitSum {

	int getSum(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	String getDigitFreeString(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isLetter(ch)) {
				output = output + ch;
			}
		}
		return output;
	}

	int getMaxLength(String[] arr) {
		int maxLength = 0;
		for (int index = 0; index < arr.length; index++) {
			int length = arr[index].length();
			if (maxLength < length) {
				maxLength = length;
			}
		}
		return maxLength;
	}

	String getSpace(String str, int maxLength) {
		String output = "";
		int spaceLength = maxLength - str.length();
		for (int index = 0; index < spaceLength; index++) {
			output = output + " ";
		}
		return output + str;
	}

	void printFinalString() {
		String input = "H5el6lo Hi Tech3noc2redits pu1ne";
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (!Character.isDigit(ch)) {
				output = output + ch;
			}
		}
		String[] arr = output.split(" ");

		int maxLength = getMaxLength(arr);
		for (int index = 0; index < arr.length; index++) {
			String str = getDigitFreeString(arr[index]);
			String space = getSpace(str, maxLength);
			System.out.println(space);
		}
		int sum = getSum(input);
		String sumString = "" + sum;
		String SpaceSum = getSpace(sumString, maxLength);
		System.out.println(SpaceSum);
	}

	public static void main(String[] args) {
		new AlignLastDigitSum().printFinalString();
	}
}
