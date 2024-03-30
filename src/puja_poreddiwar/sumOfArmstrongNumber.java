/*
 * Assignment - 97 : 25th March'2024 [45 mins]
11.2 return sum of all the argStrong number from give array. 
input : {153,27,1624,99}
output : 153 + 1634
 */

package puja_poreddiwar;

public class sumOfArmstrongNumber {

	boolean isNumAmrStrongNumber(int num) {
		String temp = String.valueOf(num);
		int sum = 0;
		for (int i = 0; i < temp.length(); i++) {
			char ch = temp.charAt(i);
			int digit = Character.getNumericValue(ch);
			sum = sum + (digit * digit * digit);
		}

		return num == sum;
	}

	void printSumOfArmstrongNo(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			if (isNumAmrStrongNumber(num)) {
				// System.out.println(num);
				sum = sum + num;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int[] data = { 153, 27, 1624, 99 };
		new sumOfArmstrongNumber().printSumOfArmstrongNo(data);
	}
}
