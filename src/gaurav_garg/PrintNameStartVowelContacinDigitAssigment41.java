package gaurav_garg;

public class PrintNameStartVowelContacinDigitAssigment41 {

	boolean isDigit(String str) {
		boolean flag;
		for (int j = 0; j < str.length(); j++) {
			char c = str.charAt(j);
			flag = Character.isDigit(c);
			if (flag == true)
				return true;
		}
		return false;
	}

	void printstartVowelContainDIgit(String str[]) {
		for (int index = 0; index < str.length; index++) {
			char start = str[index].toUpperCase().charAt(0);
			boolean answer = isDigit(str[index]);
			if (start == 'A' || start == 'E' || start == 'I' || start == 'O' || start == 'U') {
				if (answer == true) {
					System.out.println(str[index]);
				}
			}
		}
	}

	public static void main(String[] args) {
		String str1[] = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha" };
		new PrintNameStartVowelContacinDigitAssigment41().printstartVowelContainDIgit(str1);
	}
}
