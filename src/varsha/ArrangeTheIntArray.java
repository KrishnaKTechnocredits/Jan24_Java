package varsha;

import java.lang.reflect.Array;
import java.util.Arrays;

//Push all the zeros at the end of an array.
//int[] arr = {10,-12,6,-3,0,0,-33,44,0,4};
//output : {10,-12,6,-3,-33,44,4,0,0,0};

public class ArrangeTheIntArray {

	int[] getArrangeIntArray(int[] arr) {
		int[] num = new int[arr.length];
		int j = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != 0) {
				num[j] = arr[index];
				j++;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		int[] arr = { 10, -12, 6, -3, 0, 0, -33, 44, 0, 4 };
		int[] num = new ArrangeTheIntArray().getArrangeIntArray(arr);
		System.out.println(Arrays.toString(num));
	}
}
