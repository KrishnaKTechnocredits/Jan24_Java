/*Assignment - 95 : 25th March'2024 [2 hrs] 
1. find the second highest number from given array without using sorting and using array.
input : {2,22,3,55,66,77,77,34,26}
output : 66

{2,22,3,55,66,77,77,34,26}
77
{0,0,0,2,22,3,55,66,0,0,34,26}
66
{2,22,3,55,0,0,0,34,26}
55
{2,22,3,0,0,0,0,34,26}


2. find the second highest number from given array using sorting and using array.
input : {2,22,3,55,66,77,34,26}
output : 66

{2,22,3,55,66,77,77,34,26}
77
{0,0,0,2,22,3,55,66,0,0,34,26}
66
{2,22,3,55,0,0,0,34,26}
55
{2,22,3,0,0,0,0,34,26}

3. find the second highest number from given array [Collections framework (TreeSet -> ArrayList)].
input : {2,22,3,55,66,77,77,34,26}
output : 66

{2,22,3,55,66,77,77,34,26}
77
{0,0,0,2,22,3,55,66,0,0,34,26}
66
{2,22,3,55,0,0,0,34,26}
55
{2,22,3,0,0,0,0,34,26}


4 find the nth highest number from given array [Collections framework (TreeSet -> ArrayList)].
input : {2,22,3,55,66,77,77,34,26}
output : 66

{2,22,3,55,66,77,77,34,26}
77
{0,0,0,2,22,3,55,66,0,0,34,26}
66
{2,22,3,55,0,0,0,34,26}
55
{2,22,3,0,0,0,0,34,26}*/

package madhura_kulkarni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Assignment95 {
	void secondMaxWithoutSortingArray(int[] arr) {
		int max = 0;
		int secondMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} else if (arr[i] > secondMax && arr[i] != max) {
				secondMax = arr[i];
			}
		}
		System.out.println("Second maximum number without sorting an Array is : " + secondMax);
	}

	int[] getMaxNumFromArray(int[] arr) {
		int[] tempArr = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] != arr[i+1]) {
				tempArr[count] = arr[i];
				count++;
			}
		}
		tempArr[count++] = arr[arr.length - 1];
		int[] output = new int[count];
		for (int index = 0; index < count; index++) {
			output[index] = tempArr[index];
		}
		return output;
	}

	void secondMaxUsingArraySorting(int[] arr, int num) {
		Arrays.sort(arr);
		int max = 0;
		int[] outputArr = getMaxNumFromArray(arr);
		max = outputArr[outputArr.length - num];
		System.out.println(num + "th maximum number using sorting :" + max);
	}

	void secondMaxUsingCollection(int[] arr) {
		Set<Integer> secondMaxSet = new TreeSet<Integer>();
		for (int num : arr) {
			secondMaxSet.add(num);
		}
		List<Integer> secondMaxList = new ArrayList<Integer>(secondMaxSet);
		System.out
				.println("Second maximum number using collections is: " + secondMaxList.get(secondMaxList.size() - 2));
	}

	void nThMaxUsingCollection(int[] arr, int n) {
		Set<Integer> secondMaxSet = new TreeSet<Integer>();
		for (int num : arr) {
			secondMaxSet.add(num);
		}
		List<Integer> secondMaxList = new ArrayList<Integer>(secondMaxSet);
		System.out
				.println(n + "th maximum number using collections is: " + secondMaxList.get(secondMaxList.size() - n));
	}

	public static void main(String[] args) {
		int[] input = { 2, 22, 3, 55, 66, 77, 77, 34, 26 };
		Assignment95 ass95 = new Assignment95();
		System.out.println("--------Output without sorting an Array--------");
		ass95.secondMaxWithoutSortingArray(input);
		System.out.println("--------Output using Array sorting--------");
		ass95.secondMaxUsingArraySorting(input, 2);
		ass95.secondMaxUsingArraySorting(input, 4);
		System.out.println("--------Output using collection--------");
		ass95.secondMaxUsingCollection(input);
		System.out.println("--------Output using collection--------");
		ass95.nThMaxUsingCollection(input, 4);
		ass95.nThMaxUsingCollection(input, 5);
	}

}
