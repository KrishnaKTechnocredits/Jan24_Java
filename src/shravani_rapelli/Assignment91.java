package shravani_rapelli;

import java.util.Arrays;

public class Assignment91 {

	void shiftZerosToEnd(int arr[]) {
		int count =0;
		int arr2[] = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > 0) {
				arr2[count]= arr[i];
				count++;
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0) {
				arr2[count] = arr[i];
				count++;
			}
		}
		System.out.println(Arrays.toString(arr2));
	}
	
	void shiftZerosToStart(int arr[]) {
		int count =0;
		int arr2[] = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0) {
				arr2[count]= arr[i];
				count++;
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > 0) {
				arr2[count] = arr[i];
				count++;
			}
		}
		System.out.println(Arrays.toString(arr2));
	}
	
	public static void main(String[] args) {
		Assignment91 assgn91 = new Assignment91();
		int arr[] = {1,0,0,12,63,4,0,0,5,6,7};
		System.out.println("******Shift 0's to the end of an array******");
		assgn91.shiftZerosToEnd(arr);
		System.out.println("\n******Shift 0's at the start of an array******");
		assgn91.shiftZerosToStart(arr);
	}
}
