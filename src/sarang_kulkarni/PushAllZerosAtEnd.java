/*
 * Assignment - 54 : 11th Feb'2024
Push all the zeros at the end of an array.
int[] arr = {10,-12,6,-3,0,0,-33,44,0,4};
output : {10,-12,6,-3,-33,44,4,0,0,0};*/

package sarang_kulkarni;

import java.util.Arrays;

public class PushAllZerosAtEnd {

int[] rearrange(int input[]) {
		
		int j = 0, i = 0;
		int arr[] = new int[input.length];
		for (i = 0; i < input.length; i++) {
			if (input[i] != 0) {
				arr[j] = input[i];
				j++;
			}
		}
		for (i = 0; i < input.length; i++) {
			if (input[i]== 0) {
				arr[j] = input[i];
				j++;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = {10,-12,6,-3,0,0,-33,44,0,4 };
		PushAllZerosAtEnd rearrange = new PushAllZerosAtEnd();
		int[] output = rearrange.rearrange(arr);
		System.out.println(Arrays.toString(output));
	}
}
