package lovekesh_mishra;

class Assignment56 {

	void print(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					System.out.println(ch);
				}
			}

		}
	}

	public static void main(String[] args) {
		Assignment56 ans = new Assignment56();
		ans.print("technocredits");
	}
}
