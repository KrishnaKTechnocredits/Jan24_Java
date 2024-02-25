package shravani_rapelli;

import java.util.Arrays;

public class Assignment54 {
	
	int[] pushAllZerosAtEnd(int[] input) {
		int[] output = new int[input.length];
		int count = 0;
		for(int i=0; i<input.length; i++) {
			if(input[i] != 0) {
				output[count] = input[i];
				count++;
			}
		}
		for(int i=0; i<input.length; i++) {
			if(input[i]==0) {
				output[count]=input[i];
				count++;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment54 assign54 = new Assignment54();
		int[]arr = {10,-12,6,-3,0,0,-33,44,0,4};
		int[]output = assign54.pushAllZerosAtEnd(arr);
		System.out.println(Arrays.toString(output));
	}

}
