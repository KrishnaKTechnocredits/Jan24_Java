/*
 * Assignment - 84 : 23th March'2024
Print numbers present uniquely from array using ArrayList.
 */

package puja_poreddiwar;

import java.util.ArrayList;

public class Assignmnt84_2 {

	ArrayList<Integer> convertArrayToArrayList(int[] arr) {
		ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
		for (int num : arr) {
			listOfNumbers.add(num);
		}
		return listOfNumbers;
	}

	void printUniqueNumArray(int[] arr) {
		ArrayList<Integer> listOfNumbers = convertArrayToArrayList(arr);
		for (int num : listOfNumbers) {
			if (listOfNumbers.indexOf(num) == listOfNumbers.lastIndexOf(num))
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		int[] data = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		new Assignmnt84_2().printUniqueNumArray(data);
	}
}
