package shramika_vaidya;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinAndMaxNumExUsingScannerClass {

	static int getMin(int[] num) {
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}
		}
		return min;
	}

	static int getMaxNum(int[] num) {
		int max = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Enter total numbers");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter number");
			arr[i] = sc.nextInt();
		}
		int min = getMin(arr);
		int max = getMaxNum(arr);
		System.out.println("=============");
		System.out.println("From Array " + Arrays.toString(arr) + " maximum number is ->" + max + "  and "
				+ " mininimum numbers is ->" + min);
		sc.close();
		FindMinAndMaxNumExUsingScannerClass.getMaxNum(arr);
		FindMinAndMaxNumExUsingScannerClass.getMin(arr);
	}
}
