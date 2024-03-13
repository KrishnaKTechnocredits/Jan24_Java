package ankita_s;

public class Assignment72 {
	int maxWordLength;
	int addition;

	String digitSumRearrange(String inpStr) {

		String outStr = "";
		for (int i = 0; i < inpStr.length(); i++) {
			char ch = inpStr.charAt(i);
			if (Character.isDigit(ch)) {
				int number = Integer.parseInt(String.valueOf(ch));
				addition = addition + number;
			} else {
				outStr = outStr + ch;
			}
		}
		return outStr;
	}

	void maxLengthWordInStr(String inpStr) {
		String[] strArr = inpStr.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			int strLength = strArr[i].length();
			if (strLength > maxWordLength) {
				maxWordLength = strLength;
			}
		}
	}

	String leftAllignmentOfString(String inpStr) {
		int spaceLength = maxWordLength - inpStr.length();
		String spaceStr = "";
		for (int i = 0; i < spaceLength; i++) {
			spaceStr += " ";
		}
		return spaceStr + inpStr;
	}

	void printOutPut(String inpStr) {
		inpStr = digitSumRearrange(inpStr) + " " + addition;
		maxLengthWordInStr(inpStr);
		String[] strArr = inpStr.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(leftAllignmentOfString(strArr[i]));
		}
	}

	public static void main(String[] arg) {
		String str = "H5el6lo Hi Tech3noc2redits Pulne";
		Assignment72 ass72 = new Assignment72();
		ass72.printOutPut(str);
	}
}
