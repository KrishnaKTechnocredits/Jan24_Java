/*find the second highest number from given array without using sorting and using array.
input : {2,22,3,55,66,77,77,34,26}
output : 66

{2,22,3,55,66,77,77,34,26}
77
{0,0,0,2,22,3,55,66,0,0,34,26}
66
{2,22,3,55,0,0,0,34,26}
55
{2,22,3,0,0,0,0,34,26}*/
package rupali_umagol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Assignment95 {

	void getSecondHighestNum(int[] arr) {
		int max = 0;
		int secondHighest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondHighest = max;
				max = arr[i];
			} else if (arr[i] > secondHighest && arr[i] != max) {
				secondHighest = arr[i];
			}
		}
		System.out.println("Second Highest Num from Given Array : " + secondHighest);
	}

	int countMax(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	void getSecondHighestUsingSort(int[] arr) {
		int max = countMax(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				arr[i] = 0;
			}
		}
		int secondMax = countMax(arr);
		System.out.println("SecondHighest number : " + secondMax);
	}

	void getSecondHighestUsingTreeSet(int[] arr) {
		Set<Integer> secondHighestNum = new TreeSet<Integer>();
		for (int num : arr) {
			secondHighestNum.add(num);
		}
		List<Integer> al = new ArrayList<>(secondHighestNum);
		System.out.println("Second Highest number : " + al.get(al.size() - 2));
	}

	void getNthHighestUsingTreeSet(int[] arr, int n) {
		Set<Integer> nthHighestNum = new TreeSet<Integer>();
		for (int num : arr) {
			nthHighestNum.add(num);
		}
		List<Integer> al = new ArrayList<>(nthHighestNum);
		System.out.println("Nth Highest number : " + al.get(al.size() - n));
	}

	public static void main(String[] args) {
		Assignment95 assignment = new Assignment95();
		int[] input = { 2, 22, 3, 55, 66, 77, 77, 34, 26 };
		System.out.println("Without using Arrays=====");
		assignment.getSecondHighestNum(input);
		System.out.println("Using Sort and Arrays=====");
		assignment.getSecondHighestUsingSort(input);
		System.out.println("Using TreeSet=======");
		int[] str = { 2, 22, 3, 55, 66, 77, 77, 34, 26 };
		assignment.getSecondHighestUsingTreeSet(str);
		System.out.println("Nth Highest Using TreeSet======");
		assignment.getNthHighestUsingTreeSet(str, 3);

	}
}
