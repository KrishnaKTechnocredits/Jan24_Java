package akshada_marne;

public class ReverseWordsInString {

	String reverse(String str) {
		String output = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			char ch = str.charAt(index);
			output = output + ch;
		}
		return output;
	}

	void display(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			String output = reverse(arr[i]);
			System.out.print(output + " ");
		}

	}

	public static void main(String args[]) {
		ReverseWordsInString reverseWordsInString = new ReverseWordsInString();
		String str = "Welcome to Technocredits";
		String[] arr = str.split(" ");
		reverseWordsInString.display(arr);
	}
}
