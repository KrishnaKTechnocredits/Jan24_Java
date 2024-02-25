package shramika_vaidya;

public class RightAlignedTheWordsAndPrintSumOfDigitsBeforeThem {
	int getMaxLength(String[] str) {
		int maxLength = 0;
		for (int i = 0; i < str.length; i++) {
			int len = str[i].length();
			if (maxLength < len) {
				maxLength = len;
			}
		}
		return maxLength;
	}

	String getSumOfDigitsAndPrintBeforString(String name) {
		int sum = 0;
		String str = "";
		String str2 = "";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			} else
				str2 = str2 + ch;
		}
		str = str + sum + str2;
		return str;
	}

	String getRequiredSpaces(String word, int maxLength) {
		int requiredSpace = maxLength - word.length();
		String temp = "";
		for (int count = 1; count <= requiredSpace; count++) {
			temp = temp + " ";
		}
		temp = temp + word;
		return temp;
	}

	String[] getArrayPrinted(String[] input) {
		String[] output = new String[input.length];
		int maxLength = getMaxLength(input);
		for (int i = 0; i < input.length; i++) {
			String temp = getSumOfDigitsAndPrintBeforString(input[i]);
			String temp1 = getRequiredSpaces(temp, maxLength);
			output[i] = temp1;
			System.out.println(output[i]);
		}
		return output;
	}

	public static void main(String[] args) {
		String str = "H5el2lo Hi Tech3noc2redits Pu1ne";
		String[] arr = str.split(" ");
		new RightAlignedTheWordsAndPrintSumOfDigitsBeforeThem().getArrayPrinted(arr);
	}
}
