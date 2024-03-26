package gaurav_garg;

import java.util.ArrayList;
import java.util.Arrays;

public class ShiftAllZeroInBeginningOrEndAssignment91 {

	void shiftZeroAtEnd(int arr[]) {
		ArrayList<Integer> ls = new ArrayList<Integer>();
		int count1 = 0;
		for (int n = 0; n < arr.length; n++) {
			ls.add(arr[n]);
		}

		while (ls.contains(0)) {
			ls.remove(Integer.valueOf(0));
			count1++;
		}

		for (int n = 0; n < count1; n++) {
			ls.add(0);
		}
		System.out.println("Shift All Zero In End Using ArrayList -: " + ls);
	}

	void shiftZeroAtBiggning(int arr[]) {
		ArrayList<Integer> ls = new ArrayList<Integer>();
		int count1 = 0;
		for (int n = 0; n < arr.length; n++) {
			ls.add(arr[n]);
		}

		while (ls.contains(0)) {
			ls.remove(Integer.valueOf(0));
			count1++;
		}

		for (int n = 0; n < count1; n++) {
			ls.add(0, 0);
		}
		System.out.println("Shift All Zero In Begining Using ArrayList -:" + ls);
	}

	void shiftZeroAtEndUsingArray(int[] arr) {
		int[] arr1 = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr1[j] = arr[i];
				j++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr1[j] = arr[i];
				j++;
			}
		}
		System.out.println("Shift All Zero In End Using Array -:" + Arrays.toString(arr1));
	}

	void shiftZeroAtBeginingUsingArray(int[] arr) {
		int[] arr1 = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr1[j] = arr[i];
				j++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr1[j] = arr[i];
				j++;
			}
		}
		System.out.println("Shift All Zero In Begining Using Array -:" + Arrays.toString(arr1));
	}

	public static void main(String[] args) {
		int arr[] = { 1, 0, 0, 12, 63, 4, 0, 0, 5, 6, 7 };
		new ShiftAllZeroInBeginningOrEndAssignment91().shiftZeroAtEnd(arr);
		new ShiftAllZeroInBeginningOrEndAssignment91().shiftZeroAtBiggning(arr);
		new ShiftAllZeroInBeginningOrEndAssignment91().shiftZeroAtEndUsingArray(arr);
		new ShiftAllZeroInBeginningOrEndAssignment91().shiftZeroAtBeginingUsingArray(arr);
	}
}
