package rohini_deshmane.array_programs;

import java.util.Arrays;

/*
 * Assignment - 76 : 7th March'2024

please give this as assignment with condition,
- create array with max number
- create array with min number
- Create new array with elements of both array (lenght1 + length2) [union of arrays]
- add array element (index to index) and sort
 */

public class ArrayMultipleOperationProgram {
	
	void arrayWithMaxNumbers(int[] arr1, int[] arr2) {
		int[] maxArr = new int[arr1.length];
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]>arr2[i]) {
				maxArr[i]=arr1[i];
			} else if(arr1[i]<arr2[i]) {
				maxArr[i]=arr2[i];
			}
		}
		System.out.println("Array with max number \n"+Arrays.toString(maxArr));
	}
	
	void arrayWithMinNumbers(int[] arr1, int[] arr2) {
		int[] maxArr = new int[arr1.length];
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]>arr2[i]) {
				maxArr[i]=arr2[i];
			} else if(arr1[i]<arr2[i]) {
				maxArr[i]=arr1[i];
			}
		}
		System.out.println("\nArray with Min number \n"+Arrays.toString(maxArr));
	}
	
	void arrayWithBothArrayElements(int[] arr1, int[] arr2) {
		int[] maxArr = new int[arr1.length+arr2.length];
		int count=0;
		for(int i=0; i<arr1.length; i++) {
				maxArr[count]=arr1[i];
				count++;
		}
		for(int i=0; i<arr2.length; i++) {
			maxArr[count]=arr2[i];
			count++;
		}
		
		System.out.println("\nCombined Array \n"+Arrays.toString(maxArr));
	}
	
	void addBothArrayElements(int[] arr1, int[] arr2) {
		int[] maxArr = new int[arr1.length];
		for(int i=0; i<arr1.length; i++) {
				maxArr[i]=arr1[i]+arr2[i];
		}
		System.out.println("\nAdition of both Array elements \n"+Arrays.toString(maxArr));
		Arrays.sort(maxArr);
		System.out.println("Arrays after Sorting "+Arrays.toString(maxArr));
	}
	
	public static void main(String[] args) {
		int[] arr1 = {23,34,46,67,87};
		int[] arr2 = {65,43,78,45,90};
		ArrayMultipleOperationProgram operations = new ArrayMultipleOperationProgram();
		operations.arrayWithMaxNumbers(arr1, arr2);
		operations.arrayWithMinNumbers(arr1, arr2);
		operations.arrayWithBothArrayElements(arr1, arr2);
		operations.addBothArrayElements(arr1, arr2);
	}

}
