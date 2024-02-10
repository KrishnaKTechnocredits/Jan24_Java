package nikita_patil;

public class Assignment42 {
	int getCountOfDigitFromStr(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}

	void printStringHaveMoreThan1Count(String input) {
		String str = "";
		for (int i = 0; i < input.length(); i++) {
			int count = getCountOfDigitFromStr(input);
			if (count > 1) {
				str = input;
			}
		}
		if (str != "")
			System.out.println(str);
	}
	public static void main(String[] args) {
		String[] str = { "Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha" };
		for (int index = 0; index < str.length; index++) {
			String name = str[index];
			new  Assignment42().printStringHaveMoreThan1Count(name);

		}
	}
}


