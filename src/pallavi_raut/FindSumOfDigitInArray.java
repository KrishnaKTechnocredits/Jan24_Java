/*Assignment - 44 : 4th Feb'2024
Print names with sum of digits in the names from given array.

input Aakansha, Aas3hvi, Isha, I2sh4a4n
output : Aakansha -> 0
         Aas3hvi -> 3
		 Isha -> 0
		 I2sh4a4n -> 10*/

package pallavi_raut;

public class FindSumOfDigitInArray {

	public static void main(String[] args) {
		String[] arr = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n" };
		FindSumOfDigitInArray findSumOfDigitInArray = new FindSumOfDigitInArray();
		findSumOfDigitInArray.printSumOfDigitInArray(arr);
	}

	void getDigitPresentInString(String names) {
		int sum = 0;
		for (int i = 0; i < names.length(); i++) {
			char ch = names.charAt(i);
			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				int num = Integer.parseInt(String.valueOf(ch));
				sum = sum + num;
			}
		}
		System.out.println(names + "->" + sum);
	}

	void printSumOfDigitInArray(String[] str) {
		for (int index = 0; index < str.length; index++) {
			getDigitPresentInString(str[index]);
		}
	}

}
