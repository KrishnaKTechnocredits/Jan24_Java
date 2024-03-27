/*1.Shift all the zeros at the end of array.
input : [1,0,0,12,63,4,0,0,5,6,7]
output : [1,12,63,4,5,6,7,0,0,0,0]

2.Shift all the zeros at the begining of array.
input : [1,0,0,12,63,4,0,0,5,6,7]
output : [0,0,0,0,1,12,16,4,5,6,7]*/
package rupali_umagol;

import java.util.ArrayList;
import java.util.List;

public class Assignment91 {
	void getAllZeroAtend(int[] arr) {
		List<Integer> getNum = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				getNum.add(arr[i]);
			}
		}
		List<Integer> getZero = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				getZero.add(arr[i]);
		}
		getNum.addAll(getZero);
		System.out.println(getNum);
	}

	void getAllZeroAtstart(int[] arr) {
		List<Integer> getNum = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				getNum.add(arr[i]);
			}
		}
		List<Integer> getZero = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				getZero.add(arr[i]);
		}
		getZero.addAll(getNum);
		System.out.println(getZero);
	}

	public static void main(String[] args) {
		Assignment91 assignment = new Assignment91();
		int[] input = { 1, 0, 0, 12, 63, 4, 0, 0, 5, 6, 7 };
		System.out.println("All zeros at End : ");
		assignment.getAllZeroAtend(input);
		System.out.println("All zeros at Start : ");
		assignment.getAllZeroAtstart(input);
	}
}
