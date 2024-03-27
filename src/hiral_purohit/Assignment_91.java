package hiral_purohit;

import java.util.Arrays;

/*1.Shift all the zeros at the end of array.
input : [1,0,0,12,63,4,0,0,5,6,7]
output : [1,12,16,4,5,6,7,0,0,0,0]*/

public class Assignment_91 {

	int[] togetOutputArray(int[] arr) {
		int[] output = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				output[j] = arr[i];
				j++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				output[j] = arr[i];
				j++;
			}
		}
		return (output);
	}

	int[] togetOutputArray2(int[] arr) {
		int[] output = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				output[j] = arr[i];
				j++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				output[j] = arr[i];
				j++;
			}
		}
		return (output);
	}

	public static void main(String[] args) {
		int[] input = { 1, 0, 0, 12, 63, 4, 0, 0, 5, 6, 7 };
		Assignment_91 assignment_91 = new Assignment_91();
		int[] output = assignment_91.togetOutputArray(input);
		System.out.println("Variation :1");
		System.out.println(Arrays.toString(output));
		System.out.println(".................................");
		System.out.println("Variation :2");
		int[] output1 = assignment_91.togetOutputArray2(input);
		System.out.println(Arrays.toString(output1));
	}
}
