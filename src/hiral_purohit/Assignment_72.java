package hiral_purohit;

public class Assignment_72 {

	int toGetMaxLength(String[] str) {
		int maxLength = 0;
		for (int i = 0; i < str.length; i++) {
			if (maxLength < str[i].length()) {
				maxLength = str[i].length();
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
		String str1 = "";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
				str = str.replace(ch, '*');
			}
		}
		str = str.replace("*", "");
		str1 = str + " " + sum;
		return str1;
	}

	void toPrintArrangedString(String input) {
		String output = toGetSumOfDigit(input);
		String[] str = output.split(" ");
		int maxLength = toGetMaxLength(str);
		for (int i = 0; i < str.length; i++) {
			String str1 = toGetRightAllignedString(str[i], maxLength);
			System.out.println(str1);
		}
	}

	public static void main(String[] args) {
		String input = "Hel6lo Hi T4ech3noc2redits Pu1ne";
		new Assignment_72().toPrintArrangedString(input);
	}

}
