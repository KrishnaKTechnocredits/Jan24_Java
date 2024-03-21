package akshay_gaikwad;

import java.util.Arrays;

public class ArrayDivisibleBy5 {

	int[] divisileBy5(int[] arr) {
		String str = "";
		for(int num:arr) {
			if(num % 5 == 0) {
				str = str +num + " ";
			}
		}
		String[] output = str.split(" ");
		int[] intArr = new int[output.length];
		for(int index = 0; index < intArr.length;index++) {
			intArr[index] = Integer.parseInt(output[index]);
		}
		return intArr;
	}
	
	
	public static void main(String[] args) {
		int [] input = {10,32,44,55,25,23};
		int [] output = new ArrayDivisibleBy5().divisileBy5(input);
		System.out.println(Arrays.toString(output));
	}
}
