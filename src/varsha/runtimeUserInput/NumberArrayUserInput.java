package varsha.runtimeUserInput;

import java.util.Arrays;
import java.util.Scanner;

//package runtimeUserInput;
//
//Print maximum and minimum value from user defined array.
//
//NOTE : use Scanner class.
//
//input : 
//Enter total numbers
//5
//Enter num : 10
//Enter num : 2
//Enter num : 1
//Enter num : 100
//Enter num : 98
//
//output : From array [10, 2, 1, 100, 98], maximum number is 100 and minimum number is 1

public class NumberArrayUserInput {

	int getMaxNumberFromGivenArray(int[] arr) {
		int maxNum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (maxNum < arr[i]) {
				maxNum = arr[i];
			}
		}
		return maxNum;
	}
	
	int getMinNumberFromGivenArray(int[] arr) {
		int minNum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (minNum > arr[i]) {
				minNum = arr[i];
			}
		}
		return minNum;
	}

	public static void main(String[] args) {
		System.out.println("Print Enter the Number : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] arr = new int[num];
		System.out.println("Enter Number : ");
		arr[0] = scanner.nextInt();
		System.out.println("Enter Number : ");
		arr[1] = scanner.nextInt();
		System.out.println("Enter Number : ");
		arr[2] = scanner.nextInt();
		System.out.println("Enter Number : ");
		arr[3] = scanner.nextInt();
		System.out.println("Enter Number : ");
		arr[4] = scanner.nextInt();

		System.out.println(Arrays.toString(arr));

		NumberArrayUserInput numberArrayUserInput = new NumberArrayUserInput();
		int maxNum = numberArrayUserInput.getMaxNumberFromGivenArray(arr);
		System.out.println("Max Number in given array : " + maxNum);
		int minNum = numberArrayUserInput.getMinNumberFromGivenArray(arr);
		System.out.println("Min Number in given array : " + minNum);
	}

}
