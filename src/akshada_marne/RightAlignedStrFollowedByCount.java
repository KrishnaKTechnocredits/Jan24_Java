package akshada_marne;

public class RightAlignedStrFollowedByCount {
	int count;

	int findMaxLength(String[] str) {

		int maxLen = 0;
		for (int i = 0; i < str.length; i++) {
			if (maxLen < str[i].length()) {
				maxLen = str[i].length();
			}
		}
		return maxLen;
	}

	String rearrange(String str) {
		String output = "";
		int sum = 0;
		String returnStr = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				int temp = Character.getNumericValue(ch);
				count = count + temp;
			}
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isDigit(ch)) {
				output = output + ch;
			}
		}
		returnStr = output;

		return returnStr;
	}

	String processdata(String str, int maxlen) {

		int addSpace = maxlen - str.length();

		String output = " ";
		for (int i = 1; i <= addSpace; i++) {
			output = output + " ";
		}
		return output = output + str;
	}

	String processCount(int cnt, int maxlen) {
		String str = count + "";

		int addSpace = maxlen - str.length();

		String output = " ";
		for (int i = 1; i <= addSpace; i++) {
			output = output + " ";
		}
		return output = output + str;
	}

	void display(String str) {
		String[] arr = str.split(" ");

		String displaystr = "";
		String displaycount = "";

		for (int index = 0; index < arr.length; index++) {
			int maxlen = findMaxLength(arr);
			String output = rearrange(arr[index]);
			displaystr = processdata(output, maxlen);
			displaycount = processCount(count, maxlen);
			System.out.println(displaystr);

		}
		System.out.println(displaycount);

	}

	public static void main(String args[]) {
		RightAlignedStrFollowedByCount rightAlignedStrFollowedByCount = new RightAlignedStrFollowedByCount();
		String str = "H5el6lo Hi Tech3noc2redits Pu1ne";
		rightAlignedStrFollowedByCount.display(str);

	}

}
