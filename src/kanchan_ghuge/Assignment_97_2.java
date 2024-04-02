/*return sum of all the argStrong number from give array. 
input : {153,27,1634,99}
output : 153 + 1634 */

package kanchan_ghuge;

public class Assignment_97_2 {

	int getNumberOfDigits(int tempNum) {
		int digitCount = 0;
		while (tempNum > 0) {
			tempNum = tempNum / 10;
			digitCount++;
		}
		return digitCount;
	}

	boolean checkIfNumberIsArmstrong(int num) {
		int sum = 0;
		int remainder = 0;
		int originalNum = num;
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

	void getSumOfArmstrongNumbers(int[] numbArr) {
		int sum = 0;
		for (int i = 0; i < numbArr.length; i++) {
			if (checkIfNumberIsArmstrong(numbArr[i]))
				sum += numbArr[i];
		}
		System.out.println("Sum of All the Armstrong Numbers in given Array is " + sum);
	}

	public static void main(String[] args) {
		int[] num = { 153, 27, 1634, 99 };
		new Assignment_97_2().getSumOfArmstrongNumbers(num);
	}
}