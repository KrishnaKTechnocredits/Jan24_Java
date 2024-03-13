package samiksha;

public class AlignDigitFirst {

	int getMaxLength(String[] str) {
		int maxLength = 0;
		for (int index = 0; index < str.length; index++) {
			int length = str[index].length();
			if (maxLength < length) {
				maxLength = length;
			}
		}
		return maxLength;
	}

	String getDigitFirst(String str) {
		String output = "";
		String str1 = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				output = output + ch;
			} else if (Character.isLetter(ch)) {
				str1 = str1 + ch;
			}
		}
		String newOutput = output + str1;
		return newOutput;
	}

	String getSpace(String str, int maxLength) {
		int spaceLength = maxLength - str.length();
		String output = "";
		for (int index = 0; index < spaceLength; index++) {
			output = output + " ";
		}
		return output;
	}

	void printString(String[] str) {
		String finalOutput = "";
		int maxlength = getMaxLength(str);
		for (int index = 0; index < str.length; index++) {
			String output = getSpace(str[index], maxlength);
			String output1 = getDigitFirst(str[index]);
			finalOutput = output + output1;
			System.out.println(finalOutput);
		}
	}

	public static void main(String[] args) {
		String input = "H5el6lo Hi Tech3noc2redits Pu1ne";
		String[] arr = input.split(" ");
		new AlignDigitFirst().printString(arr);
	}
}
