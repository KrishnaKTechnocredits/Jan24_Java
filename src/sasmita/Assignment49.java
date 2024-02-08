package sasmita;

public class Assignment49 {

	char[] getOutput(String[] arr) {
		char[] charr = new char[arr.length];
		for (int index = 0; index < arr.length; index++) {
			int len = arr[index].length();
			char ch = arr[index].toUpperCase().charAt(len - 1);
			if (!Character.isDigit(ch))
				charr[index] = arr[index].toUpperCase().charAt(len - 1);
			else
				charr[index] = arr[index].toUpperCase().charAt(len - 2);
		}
		return charr;

	}

	void display(char[] output) {
		for (int index = 0; index < output.length; index++);
		System.out.println(output);

	}

	public static void main(String[] args) {
		String input = "techno credits32 pune4 indi5a";
		String[] arr = input.split(" ");
		Assignment49 ass49 = new Assignment49();
		char[] output = ass49.getOutput(arr);
		ass49.display(output);
	}
}
