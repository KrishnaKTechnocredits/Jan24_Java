package shravani_rapelli;

import java.util.Arrays;
public class Assignment53 {
	
	int[] getNegativeNumberPositiveNumber(int input[]) {
		int j=0;
		int arr[] = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			if (input[i] < 0) {
				arr[j] = input[i];
				j++;
			}
		}
		for (int i = 0; i < input.length; i++) {
			if (input[i] > 0) {
				arr[j] = input[i];
				j++;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 10, -12, 6, -3, -33, 44, 4 };
		Assignment53 assignment53 = new Assignment53();
		int[] output = assignment53.getNegativeNumberPositiveNumber(arr);
		System.out.println(Arrays.toString(output));
	}

}
