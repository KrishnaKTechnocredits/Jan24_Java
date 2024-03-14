package akshay_gaikwad;

import java.util.Arrays;

public class DivideArrayAndSum {
	void divideArray(int[] input) {
		int [] arr1 = new int[input.length/2];
		int [] arr2 = new int[input.length/2];
		int arr1IndexCount = 0;
		int arr2IndexCount = input.length/2;
		for(int index = 0; index < arr1.length; index++) {
			arr1[index] = input[arr1IndexCount++];
			arr2[index] = input[arr2IndexCount++];
		}
		
		int [] sum = new int[arr1.length];
		for(int index = 0; index < sum.length; index++) {
			sum [index] = arr1[index] + arr2[index];
		}
		System.out.println("1st Output array : " + Arrays.toString(arr1));
		System.out.println("2nd Output array : " + Arrays.toString(arr2));
		System.out.println("Sum of array : " + Arrays.toString(sum));
	}
	
	public static void main(String[] args) {
		int [] input = {1,10,20,12,15,6};
		new DivideArrayAndSum().divideArray(input);
	}
}
