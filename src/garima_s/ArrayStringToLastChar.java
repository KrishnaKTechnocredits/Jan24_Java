package garima_s;

class ArrayStringToLastChar {
	public static void main(String[] args) {
		String name = "techno credits32 pune4 indi5a";
		String[] nameArray = name.split(" ");
		ArrayStringToLastChar arrayStringToLastChar = new ArrayStringToLastChar();
		char[] output = arrayStringToLastChar.getCharArray(nameArray);
		arrayStringToLastChar.displayCharArray(output);
	}

	char[] getCharArray(String[] input) {
		char[] output = new char[input.length];
		for (int index = 0; index < input.length; index++) {
			output[index] = input[index].toUpperCase().charAt(input[index].length() - 1);
			if (Character.isDigit(output[index])) {
				output[index] = input[index].toUpperCase().charAt(input[index].length() - 2);
			}
		}
		return output;
	}

	void displayCharArray(char[] charArray) {
		for (int index = 0; index < charArray.length; index++) {
			System.out.println(charArray[index]);
		}
	}
}
