package madhura_kulkarni;

public class Assignment22 {

	void findDigits(String var) {
		int count = 0;
		for (int i = 0; i < var.length(); i++) {
			char ch = var.charAt(i);
			boolean flag = Character.isDigit(ch);
			if (flag == true)
				count++;
		}
		System.out.println("Frequency of Digits in a String: " + count);
	}

	public static void main(String[] args) {
		new Assignment22().findDigits("te3c3hn5o2cre3dits");
	}

}
