/*Assignment - 97 : 25th March'2024 [45 mins]
11.1 Find whether number is ArmStrong
input : 153
output : 153 is an armStrong number.*/

package madhura_kulkarni;

import java.util.Scanner;

public class Assignment97_1 {
	int getNumberOfDigits(int tempNum) {
		int digitCount = 0;
		while (tempNum > 0) {
			tempNum = tempNum / 10;
			digitCount++;
		}
		return digitCount;
	}

	boolean checkIfNumberIsArmstrong(int num) {
		int sum = 0, remainder = 0;
		int originalNum=num;
		int digitsCount = getNumberOfDigits(num);
		while (num > 0) {
			remainder = num % 10;
			sum += (Math.pow(remainder, digitsCount));
			num = num / 10;
		}
		if (originalNum == sum) 
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int input = sc.nextInt();
		Assignment97_1 ass97=new Assignment97_1();
		if(ass97.checkIfNumberIsArmstrong(input))
			System.out.println(input + " is an Armstrong Number");
		else 
			System.out.println(input + " is not an Armstrong Number");
		sc.close();
	}

}
