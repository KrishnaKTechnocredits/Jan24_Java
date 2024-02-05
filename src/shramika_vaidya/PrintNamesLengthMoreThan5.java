package shramika_vaidya;

public class PrintNamesLengthMoreThan5 {

	boolean isNamesLengthMoreThan5AndUpperCaseStart(String str) {
		char ch = str.charAt(0);
		if (Character.isUpperCase(ch) == true) {
			return true;
		} else
			return false;
	}

	void printNamesLengthMoreThan5AndStartsAsUpperCase(String[] str) {
		boolean flag = false;
		for (int index = 0; index < str.length; index++) {
			flag = isNamesLengthMoreThan5AndUpperCaseStart(str[index]);
			if (str[index].length() > 5 && flag == true) {
				System.out.println(str[index]);
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = { "Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno" };
		PrintNamesLengthMoreThan5 printNamesLengthMoreThan5 = new PrintNamesLengthMoreThan5();
		printNamesLengthMoreThan5.printNamesLengthMoreThan5AndStartsAsUpperCase(arr);
	}
}
