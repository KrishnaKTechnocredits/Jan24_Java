package samiksha;

import java.util.ArrayList;

public class FindMaxConsecutiveNum {

	void getFreq(int[] arr) {
		int max=0, count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == 1) {
				count++;
				max=count;
			} else
				count = 0;
		}System.out.println( " frequency of consecutive 1's in array is " + max);

	}

	public static void main(String[] args) {
		int[] num = { 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0 };
		new FindMaxConsecutiveNum().getFreq(num);
	}

}
