package ankita_s;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Assignment95 {
	void printSecondHighestNum(int[] arr) {
		int maxNum = 0;
		int secondHighestNum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxNum) {
				secondHighestNum = maxNum;
				maxNum = arr[i];
			} else if (arr[i] > secondHighestNum && arr[i] != maxNum) {
				secondHighestNum = arr[i];
			}
		}
		System.out.println("Second Highest Num from Given Array : " + secondHighestNum);
	}

	int countMax(int[] arr) {
		int maxNum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxNum) {
				maxNum = arr[i];
			}
		}
		return maxNum;
	}

	void printSecondHighestUsingSort(int[] arr) {
		int max = countMax(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				arr[i] = 0;
			}
		}
		int secondMax = countMax(arr);
		System.out.println("SecondHighest number : " + secondMax);
	}

	void printSecondHighestUsingTreeSet(int[] arr) {
		Set<Integer> secondHighestNum = new TreeSet<Integer>();
		for (int num : arr) {
			secondHighestNum.add(num);
		}
		List<Integer> al = new ArrayList<>(secondHighestNum);
		System.out.println("Second Highest number : " + al.get(al.size() - 2));
	}

	void printNthHighestUsingTreeSet(int[] arr, int n) {
		Set<Integer> nthHighestNum = new TreeSet<Integer>();
		for (int num : arr) {
			nthHighestNum.add(num);
		}
		List<Integer> al = new ArrayList<>(nthHighestNum);
		System.out.println("Nth Highest number : " + al.get(al.size() - n));
	}

	public static void main(String[] args) {
		Assignment95 ass95 = new Assignment95();
		int[] input = { 2, 22, 3, 55, 66, 77, 77, 34, 26 };
		System.out.println("----- Output Without using Arrays-----");
		ass95.printSecondHighestNum(input);
		System.out.println("-----Output Using Sort and Arrays-----");
		ass95.printSecondHighestUsingSort(input);
		System.out.println("-----Output Using TreeSet-----");
		int[] str = { 2, 22, 3, 55, 66, 77, 77, 34, 26 };
		ass95.printSecondHighestUsingTreeSet(str);
		System.out.println("----- Nth Highest Using TreeSet-----");
		ass95.printNthHighestUsingTreeSet(str, 3);

	}
}
