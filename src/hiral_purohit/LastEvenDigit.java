package hiral_purohit;

public class LastEvenDigit {

	void findEvenDigit(String input) {
		int lastEven = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			boolean flag = Character.isDigit(ch);

			if (flag == true) {
				int digit = Character.getNumericValue(ch);
				if (digit % 2 == 0) {
					lastEven = digit;
				}
			}
		}
		System.out.println("Last even no of String is: " + lastEven);
	}

	public static void main(String[] args) {
		new LastEvenDigit().findEvenDigit("hi48jhu6452fhu7j");
	}
}
