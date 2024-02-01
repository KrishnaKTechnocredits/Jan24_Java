package shafaque;

public class Assignment22 {
	int count = 0;

	void countDigit() {
		String str = "te3c3hn5o2cre3dits";

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			boolean temp = Character.isDigit(ch);
			if (temp == true)
				count++;
		}
		System.out.println("Total digits in String are :" + count);
	}

	public static void main(String[] args) {
		Assignment22 a22 = new Assignment22();
		a22.countDigit();
	}
}
