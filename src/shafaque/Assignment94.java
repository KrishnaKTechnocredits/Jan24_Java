package shafaque;

public class Assignment94 {

	void processData(String input) {
		System.out.println("Input string is : " + input);
		String[] str = input.split(" ");
		String output = "";
		for (int i = str.length - 1; i >= 0; i--) {
			output += str[i] + " ";
		}
		System.out.println("Output string is : " + output);

	}

	public static void main(String[] args) {
		String input = "Kajol is Working in Roche";
		new Assignment94().processData(input);
	}
}
