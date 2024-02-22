package shramika_vaidya;

public class ExtractDigitAndPrintDigitSumAtEndOfArray {
	static int sum = 0;

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

	static int getDigitExtractedAndGetSumOfThem(String str1) {
		int sum1 = 0;
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum1 = sum1 + num;
			}
		}
		return sum1;
	}

	static String getRemainingStringAfterDigitExtract(String str) {
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isDigit(ch)) {
				str1 = str1 + ch;
			}
		}
		return str1;
	}

	String getRequiredSpaces(String name, int maxlen) {
		int requiredSpaces = maxlen - name.length();
		String temp = "";
		for (int count = 1; count <= requiredSpaces; count++) {
			temp = temp + " ";
		}
		temp = temp + name;
		return temp;
	}

	String[] printArray(String[] input) {
		String[] output = new String[input.length];
		int maxCount = getMaxLength(input);
		for (int i = 0; i < input.length; i++) {
			String temp = getRequiredSpaces(input[i], maxCount);
			output[i] = temp;
			System.out.println(output[i]);
		}
		String temp1 = "";
		temp1 = temp1 + sum;
		String temp2 = getRequiredSpaces(temp1, maxCount);
		System.out.println(temp2);
		return output;
	}

	public static void main(String[] args) {
		String str = "H5el6lo Hi Tech3noc2redits Pu1ne";
		sum = getDigitExtractedAndGetSumOfThem(str);
		String temp1 = getRemainingStringAfterDigitExtract(str);
		String[] arr = temp1.split(" ");
		new ExtractDigitAndPrintDigitSumAtEndOfArray().printArray(arr);
	}
}
