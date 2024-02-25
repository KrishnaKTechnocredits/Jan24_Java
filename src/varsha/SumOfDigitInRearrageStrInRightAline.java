package varsha;

//String str = "H5el2lo Hi Tech3noc2redits Pu1ne"
//Output = 
//        7Hello
//           0Hi
//5Technocredits
//		   1Pune

class SumOfDigitInRearrageStrInRightAline {

	int getMaxWordLength(String[] str) {
		int maxLength = 0;
		for (int i = 0; i < str.length; i++) {
			if (maxLength < str[i].length()) {
				maxLength = str[i].length();
			}
		}
		return maxLength;
	}

	String getProcessString(String str, int maxLength) {
		int requiredSpace = maxLength - str.length();
		String output = "";
		for (int index = 0; index < requiredSpace; index++) {
			output = output + " ";
		}
		output = output + str;
		return output;
	}

	String getRearrangeStr(String str) {
		int str1 = 0;
		String str2 = "";
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				str1 = str1 + Character.getNumericValue(ch);
			} else {
				str2 = str2 + ch;
			}
		}
		output = str1 + str2;
		return output;
	}

	void ProcessStringArray(String str) {
		String[] input = str.split(" ");
		for (int i = 0; i < input.length; i++) {
			String strArrange = getRearrangeStr(input[i]);
			input[i] = strArrange;
		}
		int maxLength = getMaxWordLength(input);
		for (int i = 0; i < input.length; i++) {
			String output = getProcessString(input[i], maxLength);
			System.out.println(output);
		}
	}

	public static void main(String[] args) {
		String str = "H5el2lo Hi Tech3noc2redits Pu1ne";
		new SumOfDigitInRearrageStrInRightAline().ProcessStringArray(str);
	}
}