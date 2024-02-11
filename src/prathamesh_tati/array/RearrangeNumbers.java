//Assignment - 53 : 11th Feb'2024  
//Rearrange the numbers in the array, first all negative numbers followed by positive.
//int[] arr = {10,-12,6,-3,-33,44,4};
//output : [-12,-3,-33,10,6,44,4]	

package prathamesh_tati.array;

import java.util.Arrays;

public class RearrangeNumbers {

	int[] arr = { 10, -12, 6, -3, -33, 44, 4 };
	int[] output = new int[arr.length];
	int temp;
	int index;

	int[] arrangeNumbers() {
		for (index = 0; index < arr.length; index++) {
			if (arr[index] < 0) {
				output[temp] = arr[index];
				temp++;
			}
		}
		for (index = 0; index < arr.length; index++) {
			if (arr[index] > 0) {
				output[temp] = arr[index];
				temp++;
			}
		}
		return output;
	}

	void display() {
		arrangeNumbers();
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		RearrangeNumbers rearrangeNumbers = new RearrangeNumbers();
		rearrangeNumbers.display();
	}
}