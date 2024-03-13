package ashwini_b;

/*
 "String str = ""H5el6lo Hi Tech3noc2redits Pulne"";
output
                    Hell0
                       Hi
            Technocredits
                     Pune
                       17
 */
public class Assignment72_RightAlignedWord {

	int addDigit(String[] input) {
		int sum = 0;
		for (int i = 0; i < input.length; i++) {

			String str = input[i];
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (Character.isDigit(ch)) {
					sum = sum + Character.getNumericValue(ch);
				}
			}
		}
		return sum;
	}

	String[] removeDigitFromString(String[] input) {
		// output array length = input array length +1 to include some value
		String[] outputArr = new String[input.length + 1];
		for (int i = 0; i < input.length; i++) {
			String str = input[i];
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (Character.isDigit(ch)) {
					str = str.replace(ch, '*');
				}
			}
			str = str.replace("*", "");
			// System.out.println(str);
			outputArr[i] = str;
		}
		outputArr[outputArr.length - 1] = "" + addDigit(input);
		return outputArr;
	}

	void printArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	// find maximum length of string in array
	int getMaxLengthWord(String[] input) {
		int maxlength = 0;
		for (int i = 0; i < input.length; i++) {
			String str = input[i];
			if (str.length() > maxlength) {
				maxlength = str.length();
			}
		}
		return maxlength;
	}

	// make array strings Right aligned
	String[] rightAligned(String[] strarry) {
		String returnarr[] = new String[strarry.length];
		int maxlength = getMaxLengthWord(strarry);
		for (int i = 0; i < strarry.length; i++) {
			String strWithSpaces = "";
			String str = strarry[i];
			int spacelength = maxlength - str.length();
			for (int j = 0; j < spacelength; j++) {
				strWithSpaces = strWithSpaces + " ";
			}
			strWithSpaces = strWithSpaces + str;
			returnarr[i] = strWithSpaces;
		}

		return returnarr;
	}

	public static void main(String[] args) {
		String str = "H5el6lo Hi Tech3noc2redits Pu1ne";

		String[] arrayOfStr = str.split(" ");
		Assignment72_RightAlignedWord assignment72_RightAlignedWord = new Assignment72_RightAlignedWord();
		// assignment72_RightAlignedWord.addDigit(arrayOfStr);
		String[] finalarr = assignment72_RightAlignedWord.removeDigitFromString(arrayOfStr);
		String[] returnarr = assignment72_RightAlignedWord.rightAligned(finalarr);
		assignment72_RightAlignedWord.printArray(returnarr);
	}

}
