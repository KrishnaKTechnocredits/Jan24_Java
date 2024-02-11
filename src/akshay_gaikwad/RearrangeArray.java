/*Rearrange the numbers in the array, first all negative numbers followed by positive.
int[] arr = {10,-12,6,-3,-33,44,4};
output : [-12,-3,-33,10,6,44,4]*/	

package akshay_gaikwad;

import java.util.Arrays;

public class RearrangeArray {
	int[] rearrangeArray(int[] input) {
		int [] output = new int[input.length];
		int outIndex = 0;
		for (int index = 0; index < input.length; index++) {
			if(input[index] < 0) {
				output[outIndex++] = input[index];
			}
		}
		for (int index = 0; index < input.length; index++) {
			if(input[index] >= 0) {
				output[outIndex++] = input[index];
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,-12,6,-3,-33,44,4};
		int[] outArr = new RearrangeArray().rearrangeArray(arr);
		System.out.println(Arrays.toString(outArr));
	}
}
