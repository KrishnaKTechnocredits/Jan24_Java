package shramika_vaidya;

public class ReverseOnlyFirstAndLastWord {

	String getStringReversed(String str) {
		String str1 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			str1 += str.charAt(i);
		}
		return str1;
	}

	void getReversedFirstAndLastWord(String[] arr) {
		arr[0] = getStringReversed(arr[0]);
		arr[arr.length - 1] = getStringReversed(arr[arr.length - 1]);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		String str = "Welcome to the Technocredits";
		String[] arr = str.split(" ");
		new ReverseOnlyFirstAndLastWord().getReversedFirstAndLastWord(arr);
	}
}
