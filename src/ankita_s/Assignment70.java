package ankita_s;

public class Assignment70 {

	int maxStrLength;

	String rearrangeString(String inpStr) {
		String digStr = "";
		String wordStr = "";
		for (int i = 0; i < inpStr.length(); i++) {
			char ch = inpStr.charAt(i);
			if (Character.isDigit(ch)) {
				digStr = digStr + ch;
			} else {
				wordStr += ch;
			}
		}
		return digStr + wordStr;
	}

	void updateMaxLengthElement(String[] inpArr) {
		for (int i = 0; i < inpArr.length; i++) {
			int length = inpArr[i].length();
			if (length > maxStrLength) {
				maxStrLength = length;
			}
		}
	}

	String outPutString(String inpStr) {
		int length = inpStr.length();
		int spaceLength = maxStrLength - length;
		String spaceStr = "";
		for (int i = 0; i < spaceLength; i++) {
			spaceStr += " ";
		}
		return spaceStr + inpStr;
	}

	void printRearrangedArrElement(String inpStr) {
		String[] strArr = inpStr.split(" ");
		updateMaxLengthElement(strArr);
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = rearrangeString(strArr[i]);
			String output = outPutString(strArr[i]);
			System.out.println(output);
		}
	}

	public static void main(String[] arg) {
		String str = "H5el2lo Hi Tech3noc2redits Pu1ne";
		Assignment70 ass70 = new Assignment70();
		ass70.printRearrangedArrElement(str);
	}
}
