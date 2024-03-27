package shafaque;

public class Assignment88 {

	String reversetheString(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		return result;
	}

	void printtReverseString(String[] arr) {
		String outputString = "";
		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || i == arr.length - 1)
				outputString += reversetheString(arr[i]) + " ";
			else
				outputString += arr[i] + " ";
		}
		System.out.println(outputString);
	}

	public static void main(String[] args) {
		String input = "Welcome to the Technocredits";
		String[] arr = input.split(" ");
		new Assignment88().printtReverseString(arr);
	}
}