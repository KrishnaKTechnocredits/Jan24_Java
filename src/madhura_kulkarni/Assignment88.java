/*Assignment - 88 : 24th March'2024 [15-20 mins]
Write a code to reverse only first and last word of statement.
Input: Welcome to the Technocredits
Output : emocleW to the stiderconhceT*/
package madhura_kulkarni;

public class Assignment88 {
	String wordReversal(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		return output;
	}

	void processData(String input) {
		String[] str = input.split(" ");
		String[] output = new String[str.length];
		System.out.print("Output string is : ");
		for (int i = 0; i < str.length; i++) {
			if (i == 0 || (i == str.length - 1)) {
				output[i] = wordReversal(str[i]);
				System.out.print(output[i]+ " ");
			} else {
				output[i] = str[i];
				System.out.print(output[i]+ " ");
			}
		}
	}

	public static void main(String[] args) {
		String input = "Welcome to the Technocredits";
		System.out.println("Input string is : "+input);
		new Assignment88().processData(input);
	}
}
