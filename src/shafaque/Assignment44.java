package shafaque;

public class Assignment44 {
	void sumofdigits(String[] str) {
		for (int index = 0; index < str.length; index++) {
			int flag2 = atleastonedigit(str[index]);
			System.out.println(str[index] + "->" + flag2);
		}
	}

	int atleastonedigit(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			boolean temp = Character.isDigit(ch);
			if (temp == true)
				sum = sum + Character.getNumericValue(ch);
		}
		return sum;
	}

	public static void main(String[] args) {
		String[] arr = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n" };
		Assignment44 assi44 = new Assignment44();
		assi44.sumofdigits(arr);
	}
}
