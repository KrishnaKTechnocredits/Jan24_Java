package ankita_s;

class Assignment69 {

	String removeDigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				String inp = String.valueOf(ch);
				str = str.replace(inp, "*");
			}
		}
		str = str.replace(String.valueOf('*'), "");
		return str;
	}

	int getmaxString(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count++;
		}
		return count;
	}

	String getMaxString(String inpStr) {
		int maxCount = 0;
		String maxStr = "";
		String[] inpArr = inpStr.split(" ");
		for (int i = 0; i < inpArr.length; i++) {
			int count = getmaxString(inpArr[i]);
			if (count > maxCount) {
				maxCount = count;
				maxStr = inpArr[i];
			}
		}
		return maxStr;
	}

	void printingString(String inpStr, int maxLength) {
		int length = inpStr.length();
		String outPut = "";
		for (int i = 0; i < (maxLength - length); i++) {
			outPut = outPut + " ";
		}
		System.out.println(outPut + inpStr);
	}

	void rearrangeString(String inpStr) {
		inpStr = removeDigit(inpStr);
		String maxString = getMaxString(inpStr);
		int maxLength = maxString.length();
		String[] inpArr = inpStr.split(" ");
		for (int i = 0; i < inpArr.length; i++) {
			printingString(inpArr[i], maxLength);
		}
	}

	public static void main(String[] arg) {
		String str = "Hel12lo Hi Technocredits Pune";
		new Assignment69().rearrangeString(str);
	}
}
