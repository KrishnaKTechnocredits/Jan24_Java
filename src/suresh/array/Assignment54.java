/*
 * Assignment - 54 : 11th Feb'2024
Push all the zeros at the end of an array.
int[] arr = {10,-12,6,-3,0,0,-33,44,0,4};
output : {10,-12,6,-3,-33,44,4,0,0,0};
 */
package suresh.array;



public class Assignment54 {

	void MoveTheZeroToLast(int[] input) {
		String nonZero = " ";
		String zeroValue = " ";
		for (int i = 0; i < input.length; i++) {
			if (input[i] != 0) {
				nonZero = nonZero + input[i] + ",";
			} else {
				zeroValue = zeroValue + input[i] + ",";
			}
		}
		String output = nonZero + zeroValue;
		//System.out.println(output);		
		output = output.substring(0, output.length() - 1);
		System.out.println(output);
	}

	public static void main(String[] args) {
		int[] arry = { 10, -12, 6, -3, 0, 0, -33, 44, 0, 4 };
		Assignment54 assignment54 = new Assignment54();
		assignment54.MoveTheZeroToLast(arry);

	}
}