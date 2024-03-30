package varsha;

import java.util.Arrays;

//1.Shift all the zeros at the end of array.
//input : [1,0,0,12,63,4,0,0,5,6,7]
//output : [1,12,16,4,5,6,7,0,0,0,0]

//2.Shift all the zeros at the begining of array.
//input : [1,0,0,12,63,4,0,0,5,6,7]
//output : [0,0,0,0,1,12,16,4,5,6,7]
//expected = 45 min : Actual = 20 min;

public class ZeroAtEndAndAtStartOfArray {

	int[] getArrayHavingZeroAtEnd(int[] arr) {
		int[] output = new int[arr.length];
		int i = 0;
		for (int num : arr) {
			if (num != 0) {
				output[i] = num;
				i++;
			}
		}
		return output;
	}

	int[] getArrayHavingZeroInBeginning(int[] arr) {
		int[] output = new int[arr.length];
		int i = 0;
		for (int num : arr) {
			if (num == 0) {
				output[i] = num;
				i++;
			}
		}
		for (int num : arr) {
			if (num != 0) {
				output[i] = num;
				i++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 12, 63, 4, 0, 0, 5, 6, 7 };
		int[] output = new ZeroAtEndAndAtStartOfArray().getArrayHavingZeroAtEnd(arr);
		System.out.println(Arrays.toString(output));
		System.out.println();
		int[] output1 = new ZeroAtEndAndAtStartOfArray().getArrayHavingZeroInBeginning(arr);
		System.out.println(Arrays.toString(output1));

	}
}
