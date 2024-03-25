package shramika_vaidya;

import java.util.*;

public class PrintUniquelyPresentNumbersFromarray2 {

	ArrayList<Integer> getArrayListFromArray(int[] arr) {
		ArrayList<Integer> listOfNum = new ArrayList<Integer>();
		for (int num : arr) {
			listOfNum.add(num);
		}
		return listOfNum;
	}

	void getUniqueNumList(int[] arr1) {
		ArrayList<Integer> listOfNum = getArrayListFromArray(arr1);
		for (int num : arr1) {
			if (listOfNum.indexOf(num) == listOfNum.lastIndexOf(num))
				System.out.println(num);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		new PrintUniquelyPresentNumbersFromarray2().getUniqueNumList(arr);
	}
}
