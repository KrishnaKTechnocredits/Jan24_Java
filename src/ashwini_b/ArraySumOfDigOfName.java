package ashwini_b;

/*
Assignment - 44 : 4th Feb'2024
Print names with sum of digits in the names from given array.
input Aakansha, Aas3hvi, Isha, I2sh4a4n
output : Aakansha -> 0
         Aas3hvi -> 3
		 Isha -> 0
		 I2sh4a4n -> 10
 */
public class ArraySumOfDigOfName {

	void printName(String[] names) {
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			// System.out.println(name);
			int sum = 0;
			for (int j = 0; j < name.length(); j++) {
				char ch = name.charAt(j);
				if (Character.isDigit(ch)) {
					int numericvalue = Character.getNumericValue(ch);

					sum = sum + numericvalue;
				}
			}
			System.out.println(name + " ==> " + sum);
		}
	}

	public static void main(String[] args) {
		String[] inputArry = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n" };
		ArraySumOfDigOfName arraySumOfDigOfName = new ArraySumOfDigOfName();
		arraySumOfDigOfName.printName(inputArry);
	}
}
