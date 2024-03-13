package akshada_marne;

public class SumOfDigitFollowingRightAlignedString {
	int findMaxLength(String[] str) {

		int maxLen = 0;
		for (int i = 0; i < str.length; i++) {
			if (maxLen < str[i].length()) {
				maxLen = str[i].length();
			}
		}
		return maxLen;
	}

	String rearrange(String str) {
		String output = "";
		int sum = 0;
		String returnStr = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				int temp = Character.getNumericValue(ch);
				sum = sum + temp;
			}
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isDigit(ch)) {
				output = output + ch;
			}
		}
		returnStr = sum + output;

		return returnStr;
	}

	String processdata(String str, int maxlen) {

		int addSpace = maxlen - str.length();

		String output = " ";
		for (int i = 1; i <= addSpace; i++) {
			output = output + " ";
		}
		return output = output + str;
	}

	void display(String str) {
		String[] arr = str.split(" ");

		String displaystr = "";

		for (int index = 0; index < arr.length; index++) {
			int maxlen = findMaxLength(arr);
			String output = rearrange(arr[index]);
			displaystr = processdata(output, maxlen);
			System.out.println(displaystr);
		}

	}

	public static void main(String args[]) {
		SumOfDigitFollowingRightAlignedString sumOfDigitFollowingRightAlignedString = new SumOfDigitFollowingRightAlignedString();
		String str = "H5el2lo Hi Tech3noc2redits Pu1ne";
		sumOfDigitFollowingRightAlignedString.display(str);
	}
}
