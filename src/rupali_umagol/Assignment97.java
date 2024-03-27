/*11.1 Find whether number is ArmStrong
input : 153
output : 153 is an armStrong number.

11.2 return sum of all the argStrong number from give array. 
input : {153,27,1624,99,9472}
output : 153 + 1624*/
package rupali_umagol;

import java.util.Arrays;

public class Assignment97 {

	int getCount(int num) {
		int count = 0;
		while (num > 0) {
			num /= 10;
			count++;
		}
		return count;
	}

	boolean getArmStrongNum(int num) {
		int sum = 0;
		int originalNum = num;
		int count = getCount(num);
		int rem = 0;

		while (num > 0) {
			rem = num % 10;
			num /= 10;
			sum += Math.pow(rem, count);
		}
		if (sum == originalNum) {
			return true;
		}
		return false;
	}

	int getAllArmStrongNum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (getArmStrongNum(arr[i])) {
				sum += arr[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment97 assignment = new Assignment97();
		if (assignment.getArmStrongNum(153)) {
			System.out.println("number is ArmStrong number");
		} else
			System.out.println("Number is not ArmStrong number");
		int[] input = { 153, 27, 1634, 99 };
		System.out.println();
		int result = assignment.getAllArmStrongNum(input);
		System.out.println("Sum of All ArmStrong num from Array is : " + result);
	}
}
