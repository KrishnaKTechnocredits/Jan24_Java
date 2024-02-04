package lovekesh_mishra;

class PrintLastDigitTest2{
	char temp;

	char Print(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch != 'a' || ch != 'e' || ch != 'i' || ch != 'o' || ch != 'u') {
				if (input.indexOf(ch) == input.lastIndexOf(ch)) {
					temp = ch;
				}

			}
		}

		return temp;

	}

	public static void main(String[] args) {
		PrintLastDigitTest2 printLastDigit = new PrintLastDigitTest2();
		char temp = printLastDigit.Print("aakanksha");
		System.out.println(temp);
	}
}
