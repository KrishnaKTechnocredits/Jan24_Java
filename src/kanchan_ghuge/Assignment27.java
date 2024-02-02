package kanchan_ghuge;

class Assignment27 {

	void printLowerCase() {
		String input = "TechNoCREdits";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			boolean flag = Character.isUpperCase(ch);
			if (flag == true) {
				input = input.replace(ch, '*');
			}
		}
		String str = String.valueOf('*');
		input = input.replace(str, "");
		System.out.println(input);
	}

	public static void main(String[] args) {
		new Assignment27().printLowerCase();
	}
}
