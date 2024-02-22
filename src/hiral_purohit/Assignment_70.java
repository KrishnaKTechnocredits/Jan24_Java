package hiral_purohit;

public class Assignment_70 {
	int toGetMaxLength(String[] arr) {
		int maxLength = 0;
		for (int i = 0; i < arr.length; i++) {
			if (maxLength < arr[i].length()) {
				maxLength = arr[i].length();
			}
		}
		return maxLength;
	}

	String toGetOutputString(String str, int maxLength) {
		String output = "";
		int requiredSpace = maxLength - str.length();
		for (int i = 0; i < requiredSpace; i++) {
			output = output + " ";
		}
		output = output + str;
		return output;
	}

	String rearrangeDigit(String str) {
		String str1 = "";
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				str1 = str1 + Character.getNumericValue(ch);
			} else {
				str2 = str2 + ch;
			}
		}
		return (str1 + str2);
	}

	void printRightAllingedString(String input) {
		String[] arr = input.split(" ");
		int maxLength = toGetMaxLength(arr);
		for (int i = 0; i < arr.length; i++) {
			String str = rearrangeDigit(arr[i]);
			String output = toGetOutputString(str, maxLength);
			System.out.println(output);
		}
	}

	public static void main(String[] args) {
		String input = "H5el6lo Hi Tech3no2Credits P1une";
		new Assignment_70().printRightAllingedString(input);
	}

}
