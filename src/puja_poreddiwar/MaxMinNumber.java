//Assignment - 38 : 4th Feb'2024 
package puja_poreddiwar;

public class MaxMinNumber {

	int[] arr = { 10, 20, 50, 60, 30 };

	void getMaxAndMinNo(int[] arr1) {
		int maxNum = 0;
		int minNum = arr1[0];
		for (int index = 0; index < arr.length; index++) {
			if (maxNum < arr[index]) {
				maxNum = (int) arr[index];
			}
			if (minNum > arr[index]) {
				minNum = (int) arr[index];
			}
		}
		System.out.println("Maximum Number in a given array : " + maxNum);
		System.out.println("Minimum Number in a given array : " + minNum);
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 50, 60, 30 };
		new MaxMinNumber().getMaxAndMinNo(arr);
	}
}
