package hiral_purohit;

public class ArrayStringDigit {

	boolean isdigitInString(String str) {
		boolean flag = false;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean digit = Character.isDigit(ch);
			if (digit == true) {
				count++;
			}
			if (count >= 2) {
				flag = true;
			}
		}
		return flag;
	}

	void printDigitIntString(String[] input) {
		for (int index = 0; index < input.length; index++) {
			String name = input[index];
			boolean flag = isdigitInString(name);
			if (flag == true)
				System.out.println(name);
		}
	}

	public static void main(String[] args) {
		String[] arr = { "Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha" };
		new ArrayStringDigit().printDigitIntString(arr);
	}

}
