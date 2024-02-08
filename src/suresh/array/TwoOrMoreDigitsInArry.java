/*
Print all the names from given array having 2 or more than 2 digits

input : {"Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha"}
output : Is45ha
         I2sh4a4n
 */
package suresh.array;

public class TwoOrMoreDigitsInArry {

	int countdigits(String index) {
		int count = 0;
		for (int i = 0; i < index.length(); i++) {
			char ch = index.charAt(i);
			boolean flag1 = Character.isDigit(ch);
			if (flag1 == true) {
				count = count + 1;
			}
		}
		return count;
	}

	void getString(String[] input) {
		for (int i = 0; i < input.length; i++) {
			String str = input[i];
			int count = countdigits(str);
			if (count > 1) {
				System.out.println(str);
			}
		}
	}

	public static void main(String[] args) {
		String[] arry = { "Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha" };
		new TwoOrMoreDigitsInArry().getString(arry);
	}
}
