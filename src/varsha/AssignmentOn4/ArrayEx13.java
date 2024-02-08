package varsha.AssignmentOn4;

//Print names with sum of digits in the names from given array.
//
//input Aakansha, Aas3hvi, Isha, I2sh4a4n
//output : Aakansha -> 0
//    Aas3hvi -> 3
//		 Isha -> 0
//		 I2sh4a4n -> 10

public class ArrayEx13 {

	int printSumOfDigit(String input) {
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String[] str = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n" };
		for (int i = 0; i < str.length; i++) {
			String input = str[i];
			int num = new ArrayEx13().printSumOfDigit(input);
			System.out.println(input + "->" + num);
		}
	}
}
