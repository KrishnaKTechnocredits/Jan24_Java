package ashwini_b;

import java.util.Arrays;

/*
 Assignment - 54 : 11th Feb'2024
Push all the zeros at the end of an array.
int[] arr = {10,-12,6,-3,0,0,-33,44,0,4};
output : {10,-12,6,-3,-33,44,4,0,0,0};
 */
public class ArraysPushAllZeroAtEnd {

	void pushAllZeroToEnd(int[] inputarray) {
		int[] newOutputArray = new int[inputarray.length];
		int j = 0;
		for (int i = 0; i < inputarray.length; i++) {
			if (inputarray[i] != 0) {
				newOutputArray[j] = inputarray[i];
				j++;
			}
		}
		for (int i = 0; i < inputarray.length; i++) {
			if (inputarray[i] == 0) {
				newOutputArray[j] = inputarray[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(newOutputArray));
	}

	public static void main(String[] args) {
		int[] arr = { 10, -12, 6, -3, 0, 0, -33, 44, 0, 4 };
		ArraysPushAllZeroAtEnd arraysPushAllZeroAtEnd = new ArraysPushAllZeroAtEnd();
		arraysPushAllZeroAtEnd.pushAllZeroToEnd(arr);
	}

}
