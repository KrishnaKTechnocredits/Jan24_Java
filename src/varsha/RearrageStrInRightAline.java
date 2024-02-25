package varsha;

//String str = "H5el6lo Hi Tech3noc2redits Pu1ne"
//Output = 
//        56Hello
//             Hi
//32Technocredits
//		    1Pune

class RearrageStrInRightAline {

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
		String str1 = "";
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
		int maxLength = getMaxWordLength(input);
		for (int i = 0; i < input.length; i++) {
			String strarrange = getRearrangeStr(input[i]);
			String output = getProcessString(strarrange, maxLength);
			System.out.println(output);
		}
	}

	public static void main(String[] args) {
		String str = "H5el6lo Hi Tech3noc2redits Pu1ne";
		new RearrageStrInRightAline().ProcessStringArray(str);
	}
}