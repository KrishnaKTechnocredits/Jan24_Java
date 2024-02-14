package dharma;

import java.util.Arrays;

public class AllZeroAtTheEndEx1 {

	static int[] arrangeString(int[] arr) {
		int j = 0;
		int[] input = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]!=0)
				input[j++] = arr[i];
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]==0)
				input[j++] = arr[i];
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,-12,6,-3,0,0,-33,44,0,4};
		int[] j = AllZeroAtTheEndEx1.arrangeString(arr);
		System.out.println(Arrays.toString(j));

	}

}
