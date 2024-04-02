package ashwini_b;

/*
 Assignment - 87 : 24th March'2024 [15-20 mins]
 Code to reverse words in string:
 Input: Welcome to Technocredits
 Output: emocleW ot stiderconhceT
 */
public class Assignment87_ReverseWord {

	void reverseWord(String[] inputArray) {
		String returnString = "";
		for (int index = 0; index < inputArray.length; index++) {
			String str = inputArray[index];
			String reversstr = "";
			for (int j = str.length() - 1; j >= 0; j--) {
				char ch = str.charAt(j);
				reversstr = reversstr + ch;
			}
			returnString = returnString + reversstr + " ";
		}
		System.out.println(returnString);
	}

	public static void main(String[] args) {
		String str = "Welcome to Technocredits";
		String array[] = str.split(" ");
		Assignment87_ReverseWord assignment87_ReverseWord = new Assignment87_ReverseWord();
		assignment87_ReverseWord.reverseWord(array);

	}
}
