package shramika_vaidya;

public class RightAlignedTheString {

	int getMaxLengthOfString(String[] str1) {
		int maxLength = 0;
		for (int i = 0; i < str1.length; i++) {
			String temp = str1[i];
			int len = temp.length();
			if (maxLength < len) {
				maxLength = len;
			}
		}
		return maxLength;
	}

	String getRequiredSpaces(String name, int maxLength) {
		int requiredSpaces = maxLength - name.length();
		String str2 = "";
		for (int spaceCount = 1; spaceCount <= requiredSpaces; spaceCount++) {
			str2 = str2 + " ";
		}
		str2 = str2 + name;
		return str2;
	}

	String[] printArray(String[] input) {
		String[] output = new String[input.length];
		int maxCount = getMaxLengthOfString(input);
		for (int i = 0; i < input.length; i++) {
			String temp = getRequiredSpaces(input[i], maxCount);
			output[i] = temp;
			System.out.println(output[i]);
		}
		return output;
	}

	public static void main(String[] args) {
		RightAlignedTheString rightAllignedTheString = new RightAlignedTheString();
		String str = "Hello Hi Technocredits Pune";
		String[] arr = str.split(" ");
		rightAllignedTheString.printArray(arr);
	}
}
