package suresh.array;

public class LastCharInTheString {

	char[] printcharacter(String[] arry) {
		char[] charr = new char[arry.length];

		for (int i = 0; i < arry.length; i++) {
			int len = arry[i].length();
			char ch = arry[i].toUpperCase().charAt(len-1);
			
			if (Character.isDigit(ch)) {
				charr[i] = arry[i].toUpperCase().charAt(len-2);
			} else {
				charr[i] = arry[i].toUpperCase().charAt(len-1);
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
		String input = "techno credits32 pune4 indi5a";
		String[] arry = input.split(" ");
		LastCharInTheString LastCharInTheString = new LastCharInTheString();
		char[] output = LastCharInTheString.printcharacter(arry);
		LastCharInTheString.display(output);
	}
}
