package varsha;

//Write a code to reverse only first and last word of statement.
//Input: Welcome to the Technocredits
//Output : emocleW to the stiderconhceT
//Expected = 15-20 min : Actual = 15 min

public class ReverseFirstAndLastWordInStr {

	String getReverseWord(String str) {
		String output = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			output = output + str.charAt(i);
		}
		return output;
	}

	String getFirstAndLastWordReverseInStr(String str) {
		String[] arr = str.split(" ");
		String output = "";
		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || i == arr.length - 1) {
				String str1 = getReverseWord(arr[i]);
				output = output + str1 + " ";
			} else {
				output = output + arr[i] + " ";
			}
		}
		output = output.trim();
		return output;
	}

	public static void main(String[] args) {
		System.out.println(
				new ReverseFirstAndLastWordInStr().getFirstAndLastWordReverseInStr("Welcome to the Technocredits"));
	}
}
