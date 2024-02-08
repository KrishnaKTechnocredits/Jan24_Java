package puja_poreddiwar;

public class FindNameswith2OrMoreDigits {

	boolean isName2OrMoreDigits(String name) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			boolean flag = Character.isDigit(name.charAt(index));
			if (flag == true) {
				count++;
			}
		}
		if (count >= 2) {
			return true;
		}

		return false;
	}

	void printAllNames(String[] names) {
		for (int index = 0; index < names.length; index++) {
			if (isName2OrMoreDigits(names[index]) == true) {
				System.out.println(names[index]);
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha" };
		new FindNameswith2OrMoreDigits().printAllNames(names);

	}

}
