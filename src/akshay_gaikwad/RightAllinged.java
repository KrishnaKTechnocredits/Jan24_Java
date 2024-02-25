package akshay_gaikwad;

public class RightAllinged {
	int getMaxFreq(String[] arr) {
		int maxLen = 0;
		for (int index = 0; index < arr.length; index++) {
			int currentStrLen = arr[index].length();
			if (maxLen < currentStrLen) {
				maxLen = currentStrLen;
			}
		}
		return maxLen;
	}
	
	String processedStr(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if(!Character.isDigit(ch)) {
				output += ch;
			}
		}
		return output;
	}
	
	void printRightAllinged(String input) {
		input = processedStr(input);
		String [] strArr = input.split(" ");
		int maxLen = getMaxFreq(strArr);
		for (int index = 0; index < strArr.length; index++) {
			String output = "";
			int spaceReq = maxLen - strArr[index].length();
			for (int j = 1; j <= spaceReq; j++) {
				output += " ";
			}
			System.out.println(output += strArr[index]);
		}
	}
	
	public static void main(String[] args) {
		String input = "Hel2lo Hi Technocredits Pune";
		new RightAllinged().printRightAllinged(input);
	}
}
