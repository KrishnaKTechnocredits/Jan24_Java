package samiksha;

public class SplitCharArray {

	void getOutput(String[] output) {

		for (int index = 0; index < output.length; index++) {
			char ch = output[index].toUpperCase().charAt((output[index]).length() - 1);
			if (Character.isDigit(ch)) {
				System.out.print(output[index].toUpperCase().charAt((output[index]).length() - 2));
			} else
				System.out.print(ch);
		}
	}

	public static void main(String[] args) {
		String input = "techno credits32 pune4 indi5a";
		String[] arr = input.split(" ");
		new SplitCharArray().getOutput(arr);
	}
}
