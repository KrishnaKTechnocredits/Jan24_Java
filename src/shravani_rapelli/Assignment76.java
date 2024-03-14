package shravani_rapelli;

import java.util.Arrays;

public class Assignment76 {
	
	void ComparingMaxElementInTwoArrays(int arr1[], int arr2[]) {
		int resultantArray[] = new int[arr1.length];
		int j=0;
		for(int i=0; i<arr1.length;i++) {
			if(arr1[i] > arr2[i]) {
				resultantArray[j++] = arr1[i];
			}else
				resultantArray[j++] = arr2[i];
		}
		System.out.println("Comparing Maximum Element");
		System.out.println(Arrays.toString(resultantArray));
	}
	
	void ComparingMinElementInTwoArrays(int arr1[], int arr2[]) {
		int resultantArray[] = new int[arr1.length];
		int j=0;
		for(int i=0; i<arr1.length;i++) {
			if(arr1[i] > arr2[i]) {
				resultantArray[j++] = arr2[i];
			}else
				resultantArray[j++] = arr1[i];
		}
		System.out.println("Comparing Minimum Element");
		System.out.println(Arrays.toString(resultantArray));
	}
	
	void UnionOfTwoArrays(int arr1[], int arr2[]) {
		int length = arr1.length + arr2.length;
		int resultantArray[] = new int[length];
		int j=0;
		for(int i=0; i<arr1.length;i++) {
			resultantArray[j++] = arr1[i];
		}
		for(int i=0; i<arr1.length;i++) {
			resultantArray[j++] = arr2[i];
		}
		System.out.println("Union output of 2 Arrays");
		System.out.println(Arrays.toString(resultantArray));
	}
	
	void SumOfElements(int arr1[], int arr2[]) {
		int resultantArray[] = new int[arr1.length];
		int j=0;
		for(int i=0; i<arr1.length;i++) {
			resultantArray[j++] = arr1[i] + arr2[i];
		}
		System.out.println("Sum of elements of 2 Arrays");
		System.out.println(Arrays.toString(resultantArray));
	}
	
	public static void main(String[] args) {
		Assignment76 assgn76 = new Assignment76();
		int arr1[] = {23,34,46,67,87};
		int arr2[] = {65,43,78,45,90};
		assgn76.ComparingMaxElementInTwoArrays(arr1, arr2);
		assgn76.ComparingMinElementInTwoArrays(arr1, arr2);
		assgn76.UnionOfTwoArrays(arr1, arr2);
		assgn76.SumOfElements(arr1, arr2);
	}
}
