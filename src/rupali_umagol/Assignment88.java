/*Assignment - 88 : 24th March'2024 [15-20 mins]
Write a code to reverse only first and last word of statement.
Input: Welcome to the Technocredits
Output : emocleW to the stiderconhceT*/
package rupali_umagol;

public class Assignment88 {

	String reverse(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		return result;
	}

	void getReverseString(String[] arr) {
		String outputString = "";
		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || i == arr.length - 1)
				outputString += reverse(arr[i]) + " ";
			else
				outputString += arr[i] + " ";
		}
		System.out.println(outputString);
	}

	public static void main(String[] args) {
		String input = "Welcome to the Technocredits";
		String[] arr = input.split(" ");
		new Assignment88().getReverseString(arr);
	}
}
