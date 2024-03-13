package aanand.array;

import java.util.Arrays;

/*Push all the zeros at the end of an array.
int[] arr = {10,-12,6,-3,0,0,-33,44,0,4};
output : {10,-12,6,-3,-33,44,4,0,0,0};*/
public class Assignment54 {

	static int[] arrangeArray(int[] arr) {
		int j = 0;
		int[] input = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				input[j] = arr[i];
				j++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				input[j] = arr[i];
				j++;
			}
		}
		return input;
	}

	static void dispayRearrangeArray(int[] arr) {
		int[] output = arrangeArray(arr);
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		int[] arr = { 10, -12, 6, -3, 0, 0, -33, 44, 0, 4 };
		dispayRearrangeArray(arr);
	}
}