package kanchan_ghuge;

class Assignment18 {

	void reverseString(String StringName) {
		for (int index = StringName.length() - 1; index >= 0; index--) {
			char ch = StringName.charAt(index);
			System.out.println(ch);
		}
	}

	public static void main(String[] args) {
		Assignment18 assignment18 = new Assignment18();
		assignment18.reverseString("techno");
	}
}
