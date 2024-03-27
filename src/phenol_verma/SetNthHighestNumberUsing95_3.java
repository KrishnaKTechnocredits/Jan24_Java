/*
 * Assignment - 95 : 25th March'2024 [2 hrs] 
 * PhenolV_Assignment_108
3. find the second highest number from given array [Collections framework (TreeSet -> ArrayList)].
input : {2,22,3,55,66,77,77,34,26}
output : 66
 */

package phenol_verma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetNthHighestNumberUsing95_3 {

	int getSecondHighestNumberUsingSet(int[] arr) {
		Set<Integer> setArray = new TreeSet<Integer>();
		for (int num : arr) {
			setArray.add(num);
		}
		((TreeSet<Integer>) setArray).pollLast();
		return ((TreeSet<Integer>) setArray).last();
	}

	public static void main(String[] args) {
		SetNthHighestNumberUsing95_3 setNthHighestNumberUsing95_3 = new SetNthHighestNumberUsing95_3();
		int[] array = { 2, 22, 3, 55, 66, 77, 77, 34, 26 };
		System.out.print("Original Array - ");
		System.out.println(Arrays.toString(array));
		System.out.println("Second Highest Number - " + setNthHighestNumberUsing95_3.getSecondHighestNumberUsingSet(array));
	}
}
