package aanand;

public class Assignment22 {
	static int count = 0;

	static void findDigitInString(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		findDigitInString("te3c3hn5o2cre3dits");
	}

}
