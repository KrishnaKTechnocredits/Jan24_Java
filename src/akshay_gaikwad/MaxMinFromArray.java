package akshay_gaikwad;

public class MaxMinFromArray {
	int maxNumFromArray(int[] arr) {
		int maxNum = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (maxNum < arr[index]) {
				maxNum = arr[index];
			}
		}
		return maxNum;
	}
	
	int minNumFromArray(int[] arr) {
		int minNum = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (minNum > arr[index]) {
				minNum = arr[index];
			}
		}
		return minNum;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,20,50,60,30};
		MaxMinFromArray maxMinFromArray = new MaxMinFromArray();
		System.out.println("Maximum number from given array is "+ maxMinFromArray.maxNumFromArray(arr));
		System.out.println("Minimun number from given array is "+ maxMinFromArray.minNumFromArray(arr));
	}
}
