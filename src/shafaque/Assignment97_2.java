package shafaque;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment97_2 {

	int printNumisArmStrongOrNot(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0, lastD = 0, num = 0, temp = 0;
			temp = arr[i];
			while (temp > 0) {
				temp = temp / 10;
				count++;
			}
			temp = arr[i];
			while (temp > 0) {
				lastD = temp % 10;
				num += (Math.pow(lastD, count));
				temp = temp / 10;
			}
			if (arr[i] == num)
				sum += num;

		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number1 : ");
		int num = sc.nextInt();
		System.out.println("Please Enter Number2 : ");
		int num1 = sc.nextInt();
		System.out.println("Please Enter Number3 : ");
		int num2 = sc.nextInt();
		System.out.println("Please Enter Number4 : ");
		int num3 = sc.nextInt();
		sc.close();
		int[] arr = { num, num1, num2, num3 };
		System.out.println(Arrays.toString(arr));
		System.out.println(new Assignment97_2().printNumisArmStrongOrNot(arr));
	}
}
