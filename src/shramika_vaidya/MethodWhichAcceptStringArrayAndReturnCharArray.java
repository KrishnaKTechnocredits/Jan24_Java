package shramika_vaidya;

class MethodWhichAcceptStringArrayAndReturnCharArray {

	char[] getCharArray(String[] arr) {
		char[] char1 = new char[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int len = arr[i].length();
			char ch = arr[i].charAt(len - 1);
			if (Character.isDigit(ch))
				char1[i] = arr[i].charAt(len - 2);
			else
				char1[i] = arr[i].charAt(len - 1);
		}
		return char1;
	}

	void display(char[] output) {
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i]);
		}
	}

	public static void main(String[] args) {
		String str = "techno credits32 pune4 indi5a";
		String[] arr = str.split(" ");
		MethodWhichAcceptStringArrayAndReturnCharArray methodWhichAcceptStringArrayAndReturnCharArray = new MethodWhichAcceptStringArrayAndReturnCharArray();
		char[] output = methodWhichAcceptStringArrayAndReturnCharArray.getCharArray(arr);
		methodWhichAcceptStringArrayAndReturnCharArray.display(output);
	}
}
