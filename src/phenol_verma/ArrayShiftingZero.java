/*Assignment - 91 : 25th March'2024 [45 mins]
 * PhenolV_Assignment_99
1.Shift all the zeros at the end of array.
input : [1,0,0,12,63,4,0,0,5,6,7]
output : [1,12,16,4,5,6,7,0,0,0,0]

2.Shift all the zeros at the begining of array.
input : [1,0,0,12,63,4,0,0,5,6,7]
output : [0,0,0,0,1,12,16,4,5,6,7]
*/

package phenol_verma;

import java.util.Arrays;

public class ArrayShiftingZero {

	int[] shiftingZeroToBegining(int[] inputArrar) {
		int[] outputArray = new int[inputArrar.length];
		int count = 0;
		for (int index = 0; index < inputArrar.length; index++) {
			if (inputArrar[index] == 0) {
				outputArray[count] = inputArrar[index];
				count++;
			}
		}

		for (int index = 0; index < inputArrar.length; index++) {
			if (inputArrar[index] != 0) {
				outputArray[count] = inputArrar[index];
				count++;
			}
		}
		return outputArray;
	}

	int[] shiftingZeroToEnd(int[] inputArrar) {
		int[] outputArray = new int[inputArrar.length];
		int count = 0;
		for (int index = 0; index < inputArrar.length; index++) {
			if (inputArrar[index] != 0) {
				outputArray[count] = inputArrar[index];
				count++;
			}
		}
		return outputArray;
	}

	public static void main(String[] args) {
		ArrayShiftingZero arrayShiftingZero = new ArrayShiftingZero();
		int[] inputArray = { 1, 0, 0, 12, 63, 4, 0, 0, 5, 6, 7 };
		System.out.println("Original Array - " + Arrays.toString(inputArray));

		System.out.println("Array after push zero's at the begining - "
				+ Arrays.toString(arrayShiftingZero.shiftingZeroToBegining(inputArray)));

		System.out.println("Array after push zero's at the end - "
				+ Arrays.toString(arrayShiftingZero.shiftingZeroToEnd(inputArray)));
	}
}
