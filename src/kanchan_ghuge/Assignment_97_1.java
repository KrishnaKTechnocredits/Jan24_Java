/*11.1 Find whether number is ArmStrong
input : 153
output : 153 is an armStrong number */

package kanchan_ghuge;

import java.util.Scanner;

public class Assignment_97_1 {

	int getNumberOfDigits(int tempNum) {
		int digitCount = 0;
		while (tempNum > 0) {
			tempNum = tempNum / 10;
			digitCount++;
		}
		return digitCount;
	}

	boolean checkNumberIsArmstrong(int num) {
		int sum = 0;
		int remainder = 0;
		int originalNum = num;
		int digitCount = getNumberOfDigits(num);
		while (num > 0) {
			remainder = num % 10;
			sum += (Math.pow(remainder, digitCount));
			num = num / 10;
		}
		if (originalNum == sum)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int input = sc.nextInt();
		Assignment_97_1 Assign97 = new Assignment_97_1();
		if (Assign97.checkNumberIsArmstrong(input))
			System.out.println(input + " is an Armstrong Number");
		else
			System.out.println(input + " is not an Armstrong Number");
		sc.close();
	}
}
