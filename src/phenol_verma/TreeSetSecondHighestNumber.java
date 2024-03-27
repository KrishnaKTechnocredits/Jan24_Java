/*
Assignment - 95 : 25th March'2024 [2 hrs] 

4 find the nth highest number from given array [Collections framework (TreeSet -> ArrayList)].
input : {2,22,3,55,66,77,77,34,26}
output : 66
 */

package phenol_verma;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSecondHighestNumber {

	int getnthHighestNumber(int[] numberArray, int nthPosition) {
		int nthHighestNumber = 0;
		int count = 0;

		Set<Integer> setArray = new TreeSet<Integer>();
		for (int number : numberArray) {
			setArray.add(number);
		}

		int setLenght = setArray.size();

		for (int num : setArray) {
			if (count == setLenght - nthPosition) {
				nthHighestNumber = num;
			}
			count++;
		}
		return nthHighestNumber;
	}

	public static void main(String[] args) {
		TreeSetSecondHighestNumber treeSetSecondHighestNumber = new TreeSetSecondHighestNumber();
		int[] numberArray = { 2, 22, 3, 55, 66, 77, 77, 34, 26 };
		int nthPosition = 4;
		System.out.println("Original Array - " + Arrays.toString(numberArray));
		int nthHighestNumberInArray = treeSetSecondHighestNumber.getnthHighestNumber(numberArray, nthPosition);
		System.out.println(nthPosition + "th position highest number in the array is - " + nthHighestNumberInArray);
	}
}
