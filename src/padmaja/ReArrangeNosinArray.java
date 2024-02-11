/*Assignment - 53 : 11th Feb'2024
Rearrange the numbers in the array, first all negative numbers followed by positive.
int[] arr = {10,-12,6,-3,-33,44,4};
output : [-12,-3,-33,10,6,44,4]	
*/

package padmaja;

public class ReArrangeNosinArray {

	void rearrangedArray(int[] input) {
		System.out.print("{");
		int[] output = new int[input.length];
		int j = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] < 0) {
				output[j] = input[index];
				j++;
			}
		}
		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0) {
				output[j] = input[index];
				j++;
			}
			System.out.print(output[index]);
			System.out.print(", ");
		}
		System.out.print("}");
	}

	public static void main(String[] args) {
		int[] input = { 10, -12, 6, -3, -33, 44, 4 };
		ReArrangeNosinArray reArrangeNosinArray = new ReArrangeNosinArray();
		reArrangeNosinArray.rearrangedArray(input);
	}
}
