package garima_s;

public class Assignment_88 {

	String reverseWord(String str) {
		String str1 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			str1 += str.charAt(i);
		}
		return str1;
	}

	void reverseFirstLastWord(String str) {
		String[] input = str.split(" ");
		String input1 = reverseWord(input[0]) + " ";
		for (int i = 1; i < input.length - 1; i++) {
			input1 += input[i] + " ";
		}
		input1 += reverseWord(input[input.length - 1]);
		System.out.println(input1);
	}

	public static void main(String[] args) {
		String str = "Welcome to the Technocredits";
		new Assignment_88().reverseFirstLastWord(str);
	}

}
