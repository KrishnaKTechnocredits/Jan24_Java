package lovekesh_mishra;

class StringAssignment18 {

	void reverseString(String input) {
		for (int index = input.length() - 1; index >= 0; index--) {
			System.out.println(input.charAt(index));
		}
	}

	public static void main(String[] args) {
		StringAssignment18 stringAssignment18 = new StringAssignment18();
		stringAssignment18.reverseString("techno");
	}
}