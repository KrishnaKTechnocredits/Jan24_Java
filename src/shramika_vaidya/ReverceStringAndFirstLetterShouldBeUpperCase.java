package shramika_vaidya;

//Assignment 67 part -3
public class ReverceStringAndFirstLetterShouldBeUpperCase {

	String getReverceString(String str) {
		String str1 = "";
		str = str.toLowerCase();
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			str1 = str1 + ch;
		}
		return str1;
	}

	String[] setFirstLetterUpperCaseAndRemainingLowerCase(String[] input) {
		String[] output = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			String temp = getReverceString(input[i]);
			for (int j = 0; j < temp.length(); j++) {
				char ch = temp.charAt(0);
				String str1 = String.valueOf(ch);
				temp = temp.replaceFirst(str1, str1.toUpperCase());
			}
			output[i] = temp;
			System.out.print(output[i] + " ");
		}
		return output;
	}

	public static void main(String[] args) {
		String str = "Hi Hello Maulik";
		String[] arr = str.split(" ");
		new ReverceStringAndFirstLetterShouldBeUpperCase().setFirstLetterUpperCaseAndRemainingLowerCase(arr);
	}
}
