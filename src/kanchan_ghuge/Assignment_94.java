/*Input- Kajol is Working in Roche
Output- Roche in Working is Kajol */

package kanchan_ghuge;

public class Assignment_94 {

	void processData(String input) {
		System.out.println("Input String is : " + input);
		String[] str = input.split(" ");
		String output = "";
		for (int i = str.length - 1; i >= 0; i--) {
			output += str[i] + " ";
		}
		System.out.println("Output String is : " + output);
	}

	public static void main(String[] args) {
		String input = "Kajol is Working in Roche";
		new Assignment_94().processData(input);
	}
}
