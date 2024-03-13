package akshada_marne;

public class ReverseString {
	String reverseStringLogic(String str) {
		String output = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			output += ch;
		}
		return output;
	}

	void printReverseString(String[] str) {
		for (int i = 0; i < str.length; i++) {
			String reverse = reverseStringLogic(str[i]);
			System.out.print(reverse + " ");
		}
	}

	public static void main(String args[]) {
		ReverseString reverseString = new ReverseString();

		String str = "Hi Hello Maulik";
		String[] arr = str.split(" ");
		reverseString.printReverseString(arr);
	}
}
