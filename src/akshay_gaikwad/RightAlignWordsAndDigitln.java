package akshay_gaikwad;

public class RightAlignWordsAndDigitln {

	int getMaxFreq(String[] arr) {
		int maxLen = 0;
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			if (maxLen < str.length()) {
				maxLen = str.length();
			}
		}
		return maxLen;
	}

	String[] processedStringArr(String[] arr) {
		int sum = 0;
		String[] output = new String[arr.length + 1];
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			String outputStr = "";
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (Character.isLetter(ch)) {
					outputStr += ch;
				} else if (Character.isDigit(ch)) {
					sum += Integer.parseInt(Character.toString(ch));
				}
			}
			output[index] = outputStr;
		}
		output[arr.length] = "" + sum;
		return output;
	}

	void rightAlignandSumDigit(String input) {
		String[] arr = processedStringArr(input.split(" "));
		int maxLen = getMaxFreq(arr);
		for (int index = 0; index < arr.length; index++) {
			String output = "";
			String str = arr[index];
			int spaceReq = maxLen - str.length();
			for (int j = 1; j <= spaceReq; j++) {
				output += " ";
			}
			System.out.println(output+arr[index]);
		}
	}

	public static void main(String[] args) {
		String input = "He5l6lo Hi Tec3hno2credits Pu1ne";
		new RightAlignWordsAndDigitln().rightAlignandSumDigit(input);
	}
}
