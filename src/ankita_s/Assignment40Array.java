package ankita_s;

public class Assignment40Array {

	void printStartWithConsAndEndWithVowel(String[] str) {
		for (int index = 0; index < str.length; index++) {
			boolean flag = startWithCons(str[index]);
			boolean flag2 = endWithvowel(str[index]);
			if (flag == true && flag2 == true) {
				System.out.println(str[index]);
			}
		}
	}

	boolean startWithCons(String str1) {
		char ch = str1.charAt(0);
		ch = Character.toUpperCase(ch);
		if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
			return true;
		} else {
			return false;
		}
	}

	boolean endWithvowel(String str1) {
		char ch = str1.charAt(str1.length() - 1);
		ch = Character.toUpperCase(ch);
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		String[] arr = { "Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima" };
		Assignment40Array ass40 = new Assignment40Array();
		ass40.printStartWithConsAndEndWithVowel(arr);
	}
}
