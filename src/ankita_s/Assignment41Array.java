package ankita_s;

public class Assignment41Array {

	void startwithvowelandatleastonedigit(String[] str) {
		for (int index = 0; index < str.length; index++) {
			boolean flag = startwithvowel(str[index]);
			boolean flag2 = atleastonedigit(str[index]);
			if (flag == true && flag2 == true) {
				System.out.println(str[index]);
			}
		}
	}

	boolean startwithvowel(String str) {
		char ch = str.charAt(0);
		ch = Character.toUpperCase(ch);
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			return true;
		} else {
			return false;
		}
	}

	boolean atleastonedigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			if (Character.isDigit(ch1) == true)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String[] arr = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha" };
		Assignment41Array ass41 = new Assignment41Array();
		ass41.startwithvowelandatleastonedigit(arr);
	}
}
