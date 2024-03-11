package dharma;

import java.util.Arrays;

public class Assignment76 {

	int[] getMaxNumArray(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length];
		for(int i = 0; i < output.length; i++) {
			if(arr1[i] > arr2[i]) {
				output[i] = arr1[i];
			}else {
				output[i] = arr2[i];
			}
		}
		return output;
	}
	
	int[] getMinNumArray(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length];
		for(int i = 0; i < output.length; i++) {
			if(arr1[i] < arr2[i]) {
				output[i] = arr1[i];
			}else {
				output[i] = arr2[i];
			}
		}
		return output;
	}
	
	int[] unionOfArray(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length + arr2.length];
		int num = 0;
		for(int i = 0; i < arr1.length; i++) {
			output[num] = arr1[i];
			num++;
		}
		for(int i = 0; i < arr2.length; i++) {
			output[num] = arr2[i];
			num++;
		}
		return output;
	}
	
	int[] addArray(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length];
		for(int i = 0; i < output.length; i++) {
			output[i] = arr1[i] + arr2[i];
		}
		Arrays.sort(output);
		return output;
	}
	
	public static void main(String[] args) {
		Assignment76 ass76 = new Assignment76();
		int[] arr1 = {23, 34, 46, 67, 87};
		int[] arr2 = {65, 43, 78, 45, 90};
		System.out.println("Max Number from array" + Arrays.toString(ass76.getMaxNumArray(arr1, arr2)));
		System.out.println("Min Number form array" + Arrays.toString(ass76.getMinNumArray(arr1, arr2)));
		System.out.println("New Number from array" + Arrays.toString(ass76.unionOfArray(arr1, arr2)));
		System.out.println("Add Number from array" + Arrays.toString(ass76.addArray(arr1, arr2)));
	}
}
