package hiral_purohit;
/*Assignment - 88 : 24th March'2024 [15-20 mins]
Write a code to reverse only first and last word of statement.
Input: Welcome to the Technocredits
Output : emocleW to the stiderconhceT8*/

public class Assignment_88 {

	String toGetReverseString(String str) {
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			temp = temp + ch;
		}
		return temp;
	}

	String toGetOutputString(String str) {
		String[] arr = str.split(" ");
		String output = "";
		for (int i = 0; i < arr.length - 1; i++) {
			arr[0] = toGetReverseString(arr[i]);
			output = output + " " + arr[i];
		}
		arr[arr.length - 1] = toGetReverseString(arr[arr.length - 1]);
		output = output + " " + arr[arr.length - 1];
		return output.trim();
	}

	public static void main(String[] args) {
		String str = "Welcome to the Technocredits";
		System.out.println(new Assignment_88().toGetOutputString(str));
	}
}
