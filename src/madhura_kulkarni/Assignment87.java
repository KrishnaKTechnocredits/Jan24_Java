/*Assignment - 87 : 24th March'2024 [15-20 mins]
Code to reverse words in string:
 Input: Welcome to Technocredits
 Output: emocleW ot stiderconhceT*/
package madhura_kulkarni;

public class Assignment87 {
	String wordReversal(String str) {
		String output = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			output += str.charAt(i);
		}
		return output;
	}

	void processData(String str) {
		String[] str1 = str.split(" ");
		String[] output = new String[str1.length];
		for (int i = 0; i < str1.length; i++) {
			output[i] = wordReversal(str1[i]);
			System.out.print(output[i] + " ");
		}
		// System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		String input = "Welcome to Technocredits";
		new Assignment87().processData(input);
	}

}
