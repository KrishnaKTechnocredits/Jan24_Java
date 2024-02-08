package gaurav_garg;

public class PrintNameHavingSpeacialCharracterAsssisgnment43 {

	boolean checkSpeacialCharcter(String str) {
		for (int index = 0; index < str.length(); index++) {
			char char1 = str.charAt(index);
			if (Character.isDigit(char1) != true && Character.isUpperCase(char1) != true
					&& Character.isLowerCase(char1) != true) {
				return true;
			}
		}
		return false;
	}

	void printStringSpeacialChar(String str[]) {
		for (int index = 0; index < str.length; index++) {
			boolean flag = checkSpeacialCharcter(str[index]);
			if (flag == true)
				System.out.println(str[index]);
		}
	}

	public static void main(String[] args) {
		String str[] = { "Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha" };
		new PrintNameHavingSpeacialCharracterAsssisgnment43().printStringSpeacialChar(str);
	}
}
