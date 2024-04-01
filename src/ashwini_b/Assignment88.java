package ashwini_b;

/*
Assignment - 88 : 24th March'2024 [15-20 mins]
Write a code to reverse only first and last word of statement.
Input: Welcome to the Technocredits
Output : emocleW to the stiderconhceT
 */
public class Assignment88 {

	String reverseWord(String str) {
		String reversstr1 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			reversstr1 = reversstr1 + ch;
		}
		// System.out.println(reversstr1);
		return reversstr1;
	}

	void finalMethod(String[] inputArray) {
		String outputString = "";
		for (int index = 0; index < inputArray.length; index++) {
			String str = inputArray[index];
			if (index == 0 || index == inputArray.length - 1) {
				str = reverseWord(str);
			}
			outputString = outputString + str + " ";
		}
		System.out.println(outputString);
	}

	public static void main(String[] args) {
		String str = "Welcome to the Technocredits";
		String array[] = str.split(" ");
		Assignment88 assignment88 = new Assignment88();
		assignment88.finalMethod(array);
	}

}
