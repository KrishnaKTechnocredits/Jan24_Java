package hiral_purohit;

public class ArrSpecialChar {

	boolean isSpecialChar(String str) {
		boolean flag = false;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (!Character.isUpperCase(ch) && !Character.isLowerCase(ch) && !Character.isDigit(ch)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	void printSplCharString(String[] input) {
		for (int index = 0; index < input.length; index++) {
			String name = input[index];
			boolean flag = isSpecialChar(name);
			if (flag == true) {
				System.out.println(name);
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = { "Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha" };
		new ArrSpecialChar().printSplCharString(arr);
	}
}
