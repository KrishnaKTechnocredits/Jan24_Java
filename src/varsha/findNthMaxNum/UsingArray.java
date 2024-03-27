package varsha.findNthMaxNum;

import java.util.Arrays;

//1. find the second highest number from given array without using sorting and using array.
//input : {2,22,3,55,66,77,77,34,26}
//output : 66

public class UsingArray {

	int printMaxnumber(int[] numbers) {
		int max = 0;
		for (int num1 : numbers) {
			if (max < num1) {
				max = num1;
			}
		}
		return max;
	}

	int findNthMaxNumber(int[] numbers, int target) {
		int[] arr = Arrays.copyOf(numbers, numbers.length);
		int max = 0;
		if (target == 1) {
			max = printMaxnumber(arr);
		} else {
			for (int i = 0; i < target; i++) {
				max = printMaxnumber(arr);
				if (i < target - 1) {
					for (int num = 0; num < arr.length; num++) {
						if (arr[num] == max) {
							arr[num] = 0;
						}
					}
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 22, 3, 55, 66, 77, 77, 34, 26 };
		System.out.println(new UsingArray().findNthMaxNumber(arr, 1));
		System.out.println(new UsingArray().findNthMaxNumber(arr, 3));
		System.out.println(new UsingArray().findNthMaxNumber(arr, 4));
	}
}
