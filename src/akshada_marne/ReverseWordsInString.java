package akshada_marne;

public class ReverseWordsInString {

	void reverse(String[] str) {

		String output = "";
		for (int i = str.length - 1; i >= 0; i--) {
			output += str[i] + " ";
		}
		output = output.trim();
		System.out.println(output);
	}

	public static void main(String args[]) {
		ReverseWordsInString reverseWordsInString = new ReverseWordsInString();
		String str = "Kajol is Working in Roche";
		String[] arr = str.split(" ");
		reverseWordsInString.reverse(arr);
	}

}
