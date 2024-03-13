package ankita_s;

import java.util.Scanner;

public class Assignment80 {

	void getMaxMinNumber(int[] input) {
		int maxNum = input[0];
		int minNum = input[0];
		for (int num : input) {
			if (maxNum < num) {
				maxNum = num;
			}
		}
		for (int num : input) {
			if (minNum > num) {
				minNum = num;
			}
		}
		System.out.println("Maximum number is : " + maxNum);
		System.out.println("Minimum number is : " + minNum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total numbers");
		int len = sc.nextInt();
		int[] arr = new int[len - 1];
		System.out.println("Enter the numbers");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = sc.nextInt();
		}
		new Assignment80().getMaxMinNumber(arr);
		sc.close();
	}
}
