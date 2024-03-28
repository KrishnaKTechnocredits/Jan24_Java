/*
 * Assignment - 90 : 25th March'2024 [30 mins]
Code to find max consecutive 1’s in an array [0,0,1,0,0,1,1,0,1,1,1,0]
output : 3
 */

package puja_poreddiwar;

public class Assignment90 {

	void getConsecutiveNo(int[] arr) {
		int count = 0;
		int maxCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count = 0;
			} else {
				count++;
				if (maxCount < count) {
					maxCount = count;
				}
			}
		}
		System.out.println(maxCount);
	}

	public static void main(String[] args) {
		int[] data = { 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0 };
		new Assignment90().getConsecutiveNo(data);
	}
}
