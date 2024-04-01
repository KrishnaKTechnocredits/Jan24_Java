package ashwini_b;

import java.util.Arrays;

/*
 Assignment - 91 : 25th March'2024 [45 mins]
1.Shift all the zeros at the end of array.
input : [1,0,0,12,63,4,0,0,5,6,7]
output : [1,12,16,4,5,6,7,0,0,0,0]

2.Shift all the zeros at the beginning of array.
input : [1,0,0,12,63,4,0,0,5,6,7]
output : [0,0,0,0,1,12,16,4,5,6,7]

 */
public class Asgnmt91_ShiftZero {

	void shiftAllZeroAtEnd(int[] inputArray) {
		int newOutputArray[] = new int[inputArray.length];
		int j = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] != 0) {
				newOutputArray[j] = inputArray[i];
				j++;
			}
		}

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == 0) {
				newOutputArray[j] = inputArray[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(newOutputArray));
	}

	void shiftZeroAtStart(int[] inputArray) {
		int[] newOutputArray = new int[inputArray.length];
		int j = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == 0) {
				newOutputArray[j] = inputArray[i];
				j++;
			}
		}

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] != 0) {
				newOutputArray[j] = inputArray[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(newOutputArray));
	}

	public static void main(String[] args) {
		int array[] = { 1, 0, 0, 12, 63, 4, 0, 0, 5, 6, 7 };
		Asgnmt91_ShiftZero asgnmt91_ShiftZero = new Asgnmt91_ShiftZero();
		asgnmt91_ShiftZero.shiftAllZeroAtEnd(array);
		asgnmt91_ShiftZero.shiftZeroAtStart(array);
	}

}
