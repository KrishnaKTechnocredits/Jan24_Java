package rohini_deshmane.array_programs;

import java.util.Arrays;

/*
 * Assignment - 54 : 11th Feb'2024
Push all the zeros at the end of an array.
int[] arr = {10,-12,6,-3,0,0,-33,44,0,4};
output : {10,-12,6,-3,-33,44,4,0,0,0};
 */

public class ReArrangeArrayWithZero {

	int[] reArrangeArray(int[] arr) {
		int[] newArr = new int[arr.length];
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				newArr[count++]=arr[i];
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				newArr[count++]=arr[i];
			}
		}
		return newArr;
		
	}
	
	void printArray(int[] arr) {
		System.out.println("Array Before ReArrangement : \n"+Arrays.toString(arr));
		System.out.println("\nArray After ReArrangement : \n"+Arrays.toString(reArrangeArray(arr)));
	}
	
	public static void main(String[] args) {
		int[] arr = {10,-12,6,-3,0,0,-33,44,0,4};
		ReArrangeArrayWithZero reArrangeArrayWithZero = new ReArrangeArrayWithZero();
		reArrangeArrayWithZero.printArray(arr);
	}
}
