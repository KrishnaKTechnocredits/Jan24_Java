package rohini_deshmane.array_programs;

import java.util.Arrays;

/*
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
 */
public class SecondHighestUsingArrayWithoutSorting {

	int getHighestNumber(int[] arrInt) {
		int max=0;
		for(int i=0; i<arrInt.length; i++) {
			if(arrInt[i]>max) {
				max=arrInt[i];
			}
		}
		return max;
	}
	
	int[] replaceZero(int num, int[] arrInt) {
		int[] replacedArr = new int[arrInt.length];
		for(int i=0; i< arrInt.length; i++) {
			if(num != arrInt[i]) {
				replacedArr[i] = arrInt[i];
			}
		}
		return replacedArr;
	}
	
	void findHighestNumberWithoutHighest(int[] arrInt) {
		int maxNumber=0,secondHighest=0;
		int[] newArr = new int[arrInt.length];
		
		System.out.println(Arrays.toString(arrInt));
		maxNumber = getHighestNumber(arrInt);
		newArr = replaceZero(maxNumber, arrInt);
		secondHighest = getHighestNumber(newArr);
		
		System.out.println("Second highest number Without sort = "+secondHighest);
	}
	
	void findHighestWithSort(int[] arrInt) {
		int maxNumber;
		int[] sortedArr = new int[arrInt.length];
		for(int i=0; i<arrInt.length; i++) {
			maxNumber = getHighestNumber(arrInt);
			sortedArr[i]=maxNumber;
			arrInt = replaceZero(maxNumber, arrInt);
		}
		System.out.println(Arrays.toString(sortedArr));
		System.out.println("Second highest number Without sort = "+sortedArr[1]);
	}
	
	public static void main(String[] args) {
		SecondHighestUsingArrayWithoutSorting secondHighest = new SecondHighestUsingArrayWithoutSorting();
		int[] arr = {2,22,3,55,66,77,77,34,26};
		secondHighest.findHighestNumberWithoutHighest(arr);
		int[] arr2 = {2,22,3,55,66,77,34,26};
		secondHighest.findHighestWithSort(arr2);
	}
}
