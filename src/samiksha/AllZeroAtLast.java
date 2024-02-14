package samiksha;

import java.util.Arrays;

public class AllZeroAtLast {

	int[] printAllZeroAtLast(int[] num) {
		int j=0;
		int[] arr = new int[num.length];
		for (int index = 0; index < num.length; index++) {
			if (num[index] != 0) {
				arr[j] = num[index];
				 j++;
			}
		}
		 return arr;
	}
	
	public static void main(String[] args) {
		int[] input = {10,-12,6,-3,0,0,-33,44,0,4};
		int[] output =new AllZeroAtLast().printAllZeroAtLast(input);
		System.out.println(Arrays.toString(output));
	}
}
