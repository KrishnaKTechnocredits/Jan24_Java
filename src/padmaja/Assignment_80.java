package padmaja;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_80 {
	void getMaxandMinNos(int[] num) {
		int maxNo = num[0];
		int minNo = num[0];
		for (int index = 0; index < num.length; index++) {
			if (num[index] > maxNo)
				maxNo = num[index];
			else if (num[index] < minNo)
				minNo = num[index];
		}
		System.out.println("Max no is " + maxNo);
		System.out.println("Min no is " + minNo);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter total nums");
		//int[] input = new int[scanner.nextInt()];
		int[] input = new int[5];		
		for (int i = 0; i <= 4; i++) {
			System.out.println("Enter the num " + (i + 1));
			input[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(input));
		new Assignment_80().getMaxandMinNos(input);
		scanner.close();
	}
}
