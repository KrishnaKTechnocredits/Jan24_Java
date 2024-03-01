/*
 *Rearrange the numbers in the array, first all negative numbers followed by positive.
int[] arr = {10,-12,6,-3,-33,44,4};
output : [-12,-3,-33,10,6,44,4]	 
 */

package suresh.array;

public class Assignment53 {

	void printFirstNegative(int[] input) {
		int j = 0;
		int output[] = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			if (input[i] < 0) {
				output[j] = input[i];
				System.out.print(output[j]+",");
				j++;
			}
		} 
		for (int i = 0; i < input.length; i++) {
			if (input[i] > 0) {
				output[j] = input[i];
				System.out.print(output[j]+",");
				j++;
				
			}
		}
	}

	public static void main(String[] args) {
		int array[] = { 10, -12, 6, -3, -33, 44, 4 };

		Assignment53 assignment53 = new Assignment53();
		assignment53.printFirstNegative(array);

	}
}
