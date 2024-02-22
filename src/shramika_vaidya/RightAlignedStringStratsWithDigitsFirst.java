package shramika_vaidya;

public class RightAlignedStringStratsWithDigitsFirst {
	int getMaxlength(String[] str) {
		int maxLength = 0;
		for (int i = 0; i < str.length; i++) {
			int temp = str[i].length();
			if (maxLength < temp) {
				maxLength = temp;
			}
		}
		return maxLength;
	}

	String getDigitFirst(String name) {
		String str = "";
		String str1 = "";
		String str2 = "";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isDigit(ch)) {
				str1 = str1 + ch;
			} else
				str2 = str2 + ch;
		}
		str = str + str1 + str2;
		return str;
	}

	String getRequiredSpaces(String word, int maxLength) {
		int requiredSpaces = maxLength - word.length();
		String str2 = "";
		for (int spaceCount = 1; spaceCount <= requiredSpaces; spaceCount++) {
			str2 = str2 + " ";
		}
		str2 = str2 + word;
		return str2;
	}

	String[] printArray(String[] input) {
		String[] output = new String[input.length];
		int maxCount = getMaxlength(input);
		for (int i = 0; i < input.length; i++) {
			String temp2 = getDigitFirst(input[i]);
			temp2 = getRequiredSpaces(temp2, maxCount);
			output[i] = temp2;
			System.out.println(output[i]);
		}
		return output;
	}

	public static void main(String[] args) {
		RightAlignedStringStratsWithDigitsFirst rightAlignedStringStratsWithDigitsFirst = new RightAlignedStringStratsWithDigitsFirst();
		String str = "H5el2lo Hi Tech3noc2redits Pu1ne";
		String[] arr = str.split(" ");
		rightAlignedStringStratsWithDigitsFirst.printArray(arr);
	}
}
