package varsha.AssignmentOn11;

import java.util.Arrays;

/*
 * Rearrange the numbers in the array, first all negative numbers followed by positive.
 * int[] arr = {10,-12,6,-3,-33,44,4};
 * output : [-12,-3,-33,10,6,44,4]        
 */
public class RearrangeTheIntArray {

	int[] getArrangeIntArray(int[] arr) {
		int[] num = new int[arr.length];
		int j = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < 0) {
				num[j] = arr[index];
				j++;
			}
		}
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0) {
				num[j] = arr[index];
				j++;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		int[] arr = { 10, -12, 6, -3, -33, 44, 4 };
		int[] num = new RearrangeTheIntArray().getArrangeIntArray(arr);
		System.out.println(Arrays.toString(num));
	}
}
