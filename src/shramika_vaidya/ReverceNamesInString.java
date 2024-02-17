package shramika_vaidya;

//Assignment 67 part1
public class ReverceNamesInString {

	String getReverse(String str) {
		String str1 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			str1 = str1 + ch;
		}
		return str1;
	}

	String[] getStringReverse(String[] str) {
		String[] output = new String[str.length];
		for (int i = 0; i < str.length; i++) {
			String temp = getReverse(str[i]);
			output[i] = temp + " ";
			System.out.print(output[i]);
		}
		return output;
	}

	public static void main(String[] args) {
		String str = "Hi Hello Maulik";
		String[] arr = str.split(" ");
		ReverceNamesInString reverceNamesInString = new ReverceNamesInString();
		reverceNamesInString.getStringReverse(arr);
	}
}
