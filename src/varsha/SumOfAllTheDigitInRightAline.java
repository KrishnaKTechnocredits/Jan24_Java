package varsha;

//String str = "H5el6lo Hi Tech3noc2redits Pu1ne"
//Output = 
//        Hello
//           Hi
//Technocredits
//		   Pune
//           17

class SumOfAllTheDigitInRightAline {

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
		int sum = 0;
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
				str = str.replace(ch, '*');
			}
		}
		str = str.replace("*", "");
		output = str + " " + sum;
		return output;
	}

	void ProcessStringArray() {
		String str = "H5el6lo Hi Tech3noc2redits Pu1ne";
		String strArrange = getRearrangeStr(str);
		String[] input = strArrange.split(" ");
		int maxLength = getMaxWordLength(input);
		for (int i = 0; i < input.length; i++) {
			String output = getProcessString(input[i], maxLength);
			System.out.println(output);
		}
	}

	public static void main(String[] args) {
		new SumOfAllTheDigitInRightAline().ProcessStringArray();
	}
}