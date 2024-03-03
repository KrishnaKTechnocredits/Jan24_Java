package akshada_marne;

public class RightAlignedStringDigitsFirst {
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

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				output = output + str.charAt(i);
			}
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isDigit(ch)) {
				output = output + str.charAt(i);
			}
		}
		return output;
	}

	String processdata(String str, int maxlen) {

		int addSpace = maxlen - str.length();

		String output = " ";
		for (int i = 1; i <= addSpace; i++) {
			output = output + " ";
		}
		return output = output + str;
	}

	void display(String str) {
		String[] arr = str.split(" ");

		int maxlen = findMaxLength(arr);

		String displaystr = "";

		for (int index = 0; index < arr.length; index++) {
			String output = rearrange(arr[index]);
			displaystr = processdata(output, maxlen);
			System.out.println(displaystr);
		}

	}

	public static void main(String args[]) {
		RightAlignedStringDigitsFirst rightAlignedStringDigitsFirst = new RightAlignedStringDigitsFirst();
		String str = "H5el6lo Hi Tech3noc2redits Pu1ne";

		rightAlignedStringDigitsFirst.display(str);
	}
}
