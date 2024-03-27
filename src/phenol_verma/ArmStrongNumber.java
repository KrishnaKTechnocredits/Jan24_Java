/*
Assignment - 97 : 25th March'2024 [45 mins]
PhenolV_Assignment_107
11.1 Find whether number is ArmStrong
input : 153
output : 153 is an armStrong number.

11.2 return sum of all the argStrong number from give array. 
input : {153,27,1634,99}
output : 153 + 1634
*/

package phenol_verma;

import java.util.Arrays;

public class ArmStrongNumber {

	int getLengthOfDigit(int number) {
		int count = 0;
		while (number > 0) {
			number /= 10;
			count++;
		}
		return count;
	}

	boolean checkArmStrong(int number) {
		int actualNumber = number;
		boolean flag = false;
		int armStrongNumberSum = 0;
		int partNum = 0;
		int lenghtDigit = getLengthOfDigit(number);

		while (number > 0) {
			partNum = number % 10;
			number /= 10;
			armStrongNumberSum += Math.pow(partNum, lenghtDigit);
		}
		if (actualNumber == armStrongNumberSum) {
			flag = true;
		}
		return flag;
	}

	int sumOfArmStrongNumber(int[] numberArray) {
		int sumArmStronNum = 0;
		for (int index = 0; index < numberArray.length; index++) {
			if (checkArmStrong(numberArray[index])) {
				sumArmStronNum += numberArray[index];
			}
		}
		return sumArmStronNum;
	}

	public static void main(String[] args) {
		ArmStrongNumber armStrongNumber = new ArmStrongNumber();
		int checkNumber = 153;
		if (armStrongNumber.checkArmStrong(checkNumber)) {
			System.out.println(checkNumber + " is a ArmStrong number");
		} else {
			System.out.println(checkNumber + " is not a ArmStrong number");

		}

		System.out.println("*****************************************");

		int[] numberArray = { 153, 27, 1634, 99 };
		System.out.println("Orognal Array - " + Arrays.toString(numberArray));
		System.out.println("Sum of all ArmStrong number - " + armStrongNumber.sumOfArmStrongNumber(numberArray));
	}
}
