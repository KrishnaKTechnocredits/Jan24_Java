package lovekesh_mishra;

class ArrayAssignment49 {

	char[] getOutput(String[] input) {
		char[] charr = new char[input.length];
		for (int i = 0; i < input.length; i++) {
			int len = input[i].length();
			char ch = charr[i] = input[i].toUpperCase().charAt(len - 1);
			if (Character.isDigit(ch)) {
				charr[i] = input[i].toLowerCase().charAt(len - 2);
			} else {
				charr[i] = input[i].toLowerCase().charAt(len - 1);
			}

		}
		return charr;

	}

	void display(char[] output) {
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);

		}

	}

	public static void main(String[] args) {
		ArrayAssignment49 ans = new ArrayAssignment49();
		String input = "techno credits32 pune4 indi5a";
		String[] arr = input.split(" ");
		char[] output = ans.getOutput(arr);
		ans.display(output);

	}
}
