package gaurav_garg;

import java.util.Arrays;

public class Gaurav_Programming_Test_5 {

	int[] printDivisibleBy5(int arr[]) {
		int count = 0;
		for (int num : arr) {
			if (num % 5 == 0) {
				count++;
			}
		}
		int newarr[] = new int[count];
		int i = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 5 == 0) {
				newarr[i++] = arr[index];
			}
		}
		return newarr;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 32, 44, 55, 25, 23 };
		int[] newarr = new Gaurav_Programming_Test_5().printDivisibleBy5(arr);
		System.out.println(Arrays.toString(newarr));
	}
}
