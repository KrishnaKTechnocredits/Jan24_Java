package akshada_marne;

public class RightAlignedString {
	int findMaxLength(String[] str) {

		int maxlen = 0;
		int len = 0;
		for (int i = 0; i < str.length; i++) {
			if (maxlen < str[i].length())
				maxlen = str[i].length();
		}
		return maxlen;
	}

	String removeDigit(String str) {

		return str;
	}

	String addRequiredSpaces(String str, int maxlength) {
		String output = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch)) {
				String temp = str.valueOf(ch);
				str = str.replace(temp, "");
			}
		}

		int requireSpaces = maxlength - str.length();

		for (int i = 1; i <= requireSpaces; i++) {
			output = output + " ";
		}
		output = output + str;
		return output;
	}

	void process(String str) {
		String arr[] = str.split(" ");
		int maxlen = findMaxLength(arr);
		for (int i = 0; i < arr.length; i++) {
			String output = addRequiredSpaces(arr[i], maxlen);
			System.out.println(output);
		}
	}

	public static void main(String args[]) {
		RightAlignedString rightAlignedString = new RightAlignedString();
		String str = "Hell2lo Hi Technocredits Pune";
		rightAlignedString.process(str);

	}
}
