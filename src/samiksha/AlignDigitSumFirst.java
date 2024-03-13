package samiksha;

import java.util.Arrays;

public class AlignDigitSumFirst {

	String getDigitSum(String str) {
		int sum = 0;
		String str1 = "";
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			} else if (Character.isLetter(ch)) {
				str1 = str1 + ch;
			}
		}
		output = sum + str1;
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

	String getSpaceOutput(String str, int maxLength) {
		int space = maxLength - str.length();
		String output = "";
		for (int index = 0; index < space; index++) {
			output = output + " ";
		}
		return output + str;
	}

	void getFinalString(String[] str) {
		String output1="";
		int maxLength = getMaxLength(str);
		for (int index = 0; index < str.length; index++) {
			String str1= getDigitSum(str[index]);
			String space = getSpaceOutput(str1, maxLength);
			
			System.out.println(space);
		}
	}

	public static void main(String[] args) {
		String input = "H5el6lo Hi Tech3noc2redits pu1ne";
		String[] arr = input.split(" ");
		new AlignDigitSumFirst().getFinalString(arr);
	}
}
