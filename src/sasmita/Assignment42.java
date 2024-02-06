package sasmita;

public class Assignment42 {

	boolean isHaving2Digits(String name) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch) == true)
				count++;
		}
		if (count >= 2)
			return true;
		return false;
	}

	void printNames(String[] names) {
		for (int index = 0; index < names.length; index++) {
			if (isHaving2Digits(names[index]) == true) {
				System.out.println(names[index]);

			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha" };
		new Assignment42().printNames(names);
	}
}
