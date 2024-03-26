/*
 * Assignment - 90 : 25th March'2024 [30 mins]
 * PhenolV_Assignment_98
Code to find max consecutive 1’s in an array [0,0,1,0,0,1,1,0,1,1,1,0]
output : 3
 */

package phenol_verma;

import java.util.Arrays;

public class FindMaxConsecutiveFreq {

	int findFreq(int[] array) {
		int freqCount = 0;
		int count = 0;

		for (int index = 0; index < array.length; index++) {
			if (array[index] == 1) {
				count++;
				if (freqCount < count) {
					freqCount = count;
				}
			} else {
				count = 0;
			}
		}
		return freqCount;
	}

	public static void main(String[] args) {
		FindMaxConsecutiveFreq findMaxConsecutiveFreq = new FindMaxConsecutiveFreq();
		int[] inputArray = { 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0 };
		System.out.println("Original Array - " + Arrays.toString(inputArray));
		System.out.println("Highest consecutive count of 1's - " + findMaxConsecutiveFreq.findFreq(inputArray));
	}
}
