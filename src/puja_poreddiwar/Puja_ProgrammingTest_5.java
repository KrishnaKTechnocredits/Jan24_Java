/*
 * write a program to return the numbers divisible by 5 from array
 * input = { 10, 32, 44, 55, 25, 23 }
 * output =[10,55,25]
 */

package puja_poreddiwar;

import java.util.Arrays;

public class Puja_ProgrammingTest_5 {

	int[] getNumberDiv5(int[] arr) {
		int count = 0;
		for (int num : arr) {
			if (num % 5 == 0) {
				 count++;
			}
		}
			int[] output = new int[count];
			int index = 0;
			for(int num : arr) {
				if(num % 5 ==0) {
				output[index] = num;
				index++;
			}
		}
			return output;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 32, 44, 55, 25, 23 };
		int[] outputArr = new Puja_ProgrammingTest_5().getNumberDiv5(arr);
		System.out.println(Arrays.toString(outputArr));

	}

}
