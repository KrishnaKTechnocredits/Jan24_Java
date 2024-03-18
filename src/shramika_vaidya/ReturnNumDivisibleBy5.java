package shramika_vaidya;

import java.util.Arrays;

public class ReturnNumDivisibleBy5 {

	int[] getNumbers(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0) {
				count++;
			}
		}
		int[] output = new int[count];
		int index = 0;
		for (int num : arr) {
			if (num % 5 == 0) {
				output[index] = num;
				index++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 32, 44, 55, 25, 23 };
		ReturnNumDivisibleBy5 returnNumDivisibleBy5 = new ReturnNumDivisibleBy5();
		int[] arr1 = returnNumDivisibleBy5.getNumbers(arr);
		System.out.println(Arrays.toString(arr1));
	}
}
