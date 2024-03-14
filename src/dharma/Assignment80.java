package dharma;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment80 {

	int findMin(int[] arr) {
		int min =arr[0];
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	int findMax(int[] arr) {
		int max =arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	void getArray() {
		int Count=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Total size of Array");
		Count = scan.nextInt();
		int[] newArr = new int[Count];

		for(int i=0; i<Count; i++) {
			scan = new Scanner(System.in);
			System.out.println("Enter Number "+i+1);
			newArr[i]= scan.nextInt();
		}
		System.out.println("Original Array - " + Arrays.toString(newArr));
		System.out.println("Minimum Number = "+findMin(newArr));
		System.out.println("Maximum Number = "+findMax(newArr));
	}

	public static void main(String[] args) {
		Assignment80 ass80 = new Assignment80();
		ass80.getArray();
	}
}
