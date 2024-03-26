package shramika_vaidya;

public class ReverseWordInString {

	String getWordReversed(String str) {
		String str1 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			str1 += str.charAt(i);
		}
		return str1;
	}

	void getReversedString(String[] arr1) {
		String[] output = new String[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = getWordReversed(arr1[i]);
			output[i] = arr1[i];
			System.out.print(output[i] + " ");
		}

	}

	public static void main(String[] args) {
		String str = "Welcome to Technocredits";
		String[] arr = str.split(" ");
		new ReverseWordInString().getReversedString(arr);
	}
}
