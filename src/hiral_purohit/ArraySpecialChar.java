package hiral_purohit;

public class ArraySpecialChar {

	boolean isStartsVowel(String str) {
		boolean flag = false;
		char ch = str.charAt(0);
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			flag = true;
		return flag;
	}

	boolean isdigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch) == true)
				return true;
		}
		return false;
	}

	void printNames(String[] name) {
		for (int index = 0; index < name.length; index++) {
			String input = name[index];
			boolean flag = isStartsVowel(input) && isdigit(input);
			if (flag == true)
				System.out.println(input);
		}
	}

	public static void main(String[] args) {
		String[] arr = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha" };
		new ArraySpecialChar().printNames(arr);
	}
}
