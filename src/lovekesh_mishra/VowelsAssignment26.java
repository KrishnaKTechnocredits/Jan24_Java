package lovekesh_mishra;

class VowelsAssignment26 {

	void removeVowels(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				input = input.replace(String.valueOf(ch), "*");
			}
		}
		input = input.replace("*", "");
		System.out.println(input);
	}

	public static void main(String[] args) {
		VowelsAssignment26 vowelsAssignment26 = new VowelsAssignment26();
		vowelsAssignment26.removeVowels("technocredits");
	}
}
