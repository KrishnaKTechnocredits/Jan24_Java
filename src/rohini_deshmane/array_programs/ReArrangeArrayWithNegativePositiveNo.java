package rohini_deshmane.array_programs;

import java.util.Arrays;

/*
 * Assignment - 53 : 11th Feb'2024
Rearrange the numbers in the array, first all negative numbers followed by positive.
int[] arr = {10,-12,6,-3,-33,44,4};
output : [-12,-3,-33,10,6,44,4]	
 */

public class ReArrangeArrayWithNegativePositiveNo {
	
	private int[] reArangeArray(int[] arr) {
		int[] renewdArr = new int[arr.length];
		int count=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < 0) {
				renewdArr[count++] = arr[i];
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > 0) {
				renewdArr[count++] = arr[i];
			}
		}
		return renewdArr;
	}
	
	void printArr(int[] arr) {
		System.out.println("Array Before Arrangement : \n"+Arrays.toString(arr));
		System.out.println("\nArray After Arrangement : \n"+Arrays.toString(reArangeArray(arr)));	
	}
	
	public static void main(String[] args) {
		int[] arr = {10,-12,6,-3,-33,44,4};
		ReArrangeArrayWithNegativePositiveNo arrangeArr = new ReArrangeArrayWithNegativePositiveNo();
		arrangeArr.printArr(arr);
	}
}
