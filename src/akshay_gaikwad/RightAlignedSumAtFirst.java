package akshay_gaikwad;

public class RightAlignedSumAtFirst {

	int getMaxLength(String[] arr) {
		int maxLen = 0;
		for (int index = 0; index < arr.length; index++) {
			int currentStrLen = arr[index].length();
			if (maxLen < currentStrLen) {
				maxLen = currentStrLen;
			}
		}
		return maxLen;
	}
	
	String[] proccsedStrArr(String[] arr) {
		String[] output = new String[arr.length];
		for(int index = 0; index < arr.length; index++) {
			String currStr = arr[index];
			int digit = 0;
			String letter = "";
			for (int j = 0; j < currStr.length(); j++) {
				char ch = currStr.charAt(j);
				if(Character.isDigit(ch)) {
					digit += Character.getNumericValue(ch);
				} else if( Character.isLetter(ch)) {
					letter += ch;
				}
			}
			output[index] = digit + letter;
		}
		return output;
	}
	
	void printStrRightAlignedDigit1st(String str) {
		String[] output = str.split(" ");
		output = proccsedStrArr(output);
		int maxLen = getMaxLength(output);
		int spaceReq = 0;
		for (int index = 0; index < output.length; index++) {
			String currStr = output[index];
			spaceReq = maxLen - currStr.length();
			String outputStr = "";
			for (int j = 1; j <= spaceReq; j++) {
				outputStr += " ";
			}
			System.out.println(outputStr + output[index]); 
		}
	}
	
	public static void main(String[] args) {
		String input = "H5el2lo Hi Te3chnocr2edits Pu1ne";
		new RightAlignedSumAtFirst().printStrRightAlignedDigit1st(input);
	}
}
