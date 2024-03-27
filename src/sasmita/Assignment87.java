/*Code to reverse words in string:
Input: Welcome to Technocredits
Output: emocleW ot stiderconhceT
 */
package sasmita;

public class Assignment87 {

	String getReverseWord(String input) {
		String str = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			str = str + input.charAt(i);
		}
		return str;

	}

	void reverseString(String str) {
		String finaloutput = "";
		String[] str1 = str.split(" ");
		for (int i = 0; i < str1.length; i++) {
			finaloutput = finaloutput + getReverseWord(str1[i]) + " ";
		}
		System.out.println(finaloutput);
	}

	public static void main(String[] args) {
		Assignment87 assignment87 = new Assignment87();
		assignment87.reverseString("Welcome to Technocredits");

	}

}
