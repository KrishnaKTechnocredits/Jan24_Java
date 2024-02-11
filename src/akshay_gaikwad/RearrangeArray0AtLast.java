/*Push all the zeros at the end of an array.
int[] arr = {10,-12,6,-3,0,0,-33,44,0,4};
output : {10,-12,6,-3,-33,44,4,0,0,0};*/

package akshay_gaikwad;

import java.util.Arrays;

public class RearrangeArray0AtLast {
	
	int[] rearrangeArray0AtLast(int[] input) {
		String outStr = "";
		String strZero = "";
		for (int index  = 0; index < input.length; index++) {
			if(input[index] != 0) {
				outStr += input[index] +",";
			} else {
				strZero +=  input[index] +",";
			}
		}
		String output = outStr + strZero;
		output = output.substring(0, output.length()-1);
		String[] outString = output.split(",");
		int[] outputInt = new int[outString.length];
		for (int index = 0; index < outString.length; index++) {
			outputInt[index] = Integer.parseInt(outString[index]);
		}
		return outputInt;
	}
	public static void main(String[] args) {
		int[] arr = {10,-12,6,-3,0,0,-33,44,0,4};
		int[] output = new RearrangeArray0AtLast().rearrangeArray0AtLast(arr);
		System.out.println(Arrays.toString(output));
	}
}
