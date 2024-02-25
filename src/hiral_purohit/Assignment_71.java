package hiral_purohit;

public class Assignment_71 {

	int toGetMaxLength(String[] arr) {
		int maxLength = 0;
		for (int i = 0; i < arr.length; i++) {
			if (maxLength < arr[i].length()) {
				maxLength = arr[i].length();
			}
		}
		return maxLength;
	}

	String toGetRightAllignedString(String str, int maxLength) {
		String output = "";
		int requiredSpace = maxLength - str.length();
		for (int i = 0; i < requiredSpace; i++) {
			output = output + " ";
		}
		output = output + str;
		return output;
	}

	String toGetSumOfDigit(String str) {
		int sum = 0;
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			} else {
				str1 = str1 + ch;
			}
		}
		return (sum + str1);
	}

	void toPrintProcessedString(String input) {
		String[] str = input.split(" ");
		int maxLength = toGetMaxLength(str);
		for (int i = 0; i < str.length; i++) {
			String str1 = toGetSumOfDigit(str[i]);
			String output = toGetRightAllignedString(str1, maxLength);
			System.out.println(output);
		}
	}

	public static void main(String[] args) {
		String input = "He5l2lo Hi Techn3ocr2edits Pu1ne";
		new Assignment_71().toPrintProcessedString(input);
	}
}
