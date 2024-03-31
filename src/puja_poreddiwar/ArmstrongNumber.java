/*
 * Assignment - 97 : 25th March'2024 [45 mins]
11.1 Find whether number is ArmStrong
input : 153
output : 153 is an armStrong number.

 */

package puja_poreddiwar;

public class ArmstrongNumber {

	void amstrongNo(int num) {

		String temp = String.valueOf(num);
		int sum = 0;
		for (int i = 0; i < temp.length(); i++) {
			char ch = temp.charAt(i);
			int digit = Character.getNumericValue(ch);
			sum = sum + (digit * digit * digit);
		}
		if (sum == num) {
			System.out.println(num + " is an armStrong number.");
		} else
			System.out.println(num + " is not an armStrong number.");
	}

	public static void main(String[] args) {
		new ArmstrongNumber().amstrongNo(154);
	}
}
