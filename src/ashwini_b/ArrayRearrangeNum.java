package ashwini_b;

import java.util.Arrays;

/*
Assignment - 53 : 11th Feb'2024
Rearrange the numbers in the array, first all negative numbers followed by positive.
int[] arr = {10,-12,6,-3,-33,44,4};
output : [-12,-3,-33,10,6,44,4]
 */
public class ArrayRearrangeNum {

	void arrangeNumNegativeAndPositive(int inputarr[]) {
		int[] newOutputArray = new int[inputarr.length];
		int j = 0;
		for (int i = 0; i < inputarr.length; i++) {
			if (inputarr[i] < 0) {
				newOutputArray[j] = inputarr[i];
				j++;
			}
		}
		for (int i = 0; i < inputarr.length; i++) {
			if (inputarr[i] > 0) {
				newOutputArray[j] = inputarr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(newOutputArray));
	}

	public static void main(String[] args) {
		int[] arr = { 10, -12, 6, -3, -33, 44, 4 };
		ArrayRearrangeNum arrayRearrangeNum = new ArrayRearrangeNum();
		arrayRearrangeNum.arrangeNumNegativeAndPositive(arr);
	}

}
