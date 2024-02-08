package priya_t;

public class Assignment43_SpecialCharinArray {

	boolean isSpecialCharacter(String str) {
		boolean flag = false;

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (!Character.isDigit(ch) && !Character.isLowerCase(ch) && !Character.isUpperCase(ch)) {
				flag = true;
				System.out.println("The Names having Special Characters are :" + str);
				break;
			}
		}
		return false;
	}

	void printNames(String[] str) {
      for (int i = 0; i < str.length; i++) {
			if (isSpecialCharacter(str[i]) == true)
				System.out.println(str[i]);
		}
	}

	public static void main(String[] args) {
		String input[] = { "Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha" };
		Assignment43_SpecialCharinArray specialchar = new Assignment43_SpecialCharinArray();
		specialchar.printNames(input);
	}
}
