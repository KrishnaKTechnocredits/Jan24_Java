package samiksha;

import java.util.Arrays;

public class MaxNumberArray {
	
	void getMaxNumArray(int[] arr1,int[]arr2) {
		int[] output = new int[arr1.length];
		for(int index=0;index < arr1.length; index++) {
			if(arr1[index]>arr2[index]) {
				output[index]=arr1[index];
			}else
				output[index]=arr2[index];
		}
		System.out.println("max number array is : ");
		System.out.println(Arrays.toString(output));
	}
	
	void getMinNumArray(int[] arr1, int[]arr2) {
		int[] output = new int[arr1.length];
		for(int index=0;index<arr1.length;index++) {
			if(arr1[index]<arr2[index]) {
				output[index]=arr1[index];
			}else
				output[index]=arr2[index];
		}
		System.out.println("min number array is : ");
		System.out.println(Arrays.toString(output));
	}
	
	void getUnionOfArray(int[]arr1, int[]arr2) {
		int[]output= new int[arr1.length + arr2.length];
		int j =0;
		System.out.println("Union of 2 arrays is : ");
		for(int index=0;index<arr1.length;index++) {
			output[j]=arr1[index];
			j++;
		}
		for(int index=0; index<arr2.length;index++) {
			output[j]=arr2[index];
			j++;
		}
		System.out.println(Arrays.toString(output));
	}
	
	void getIndexSumAndSort(int[] arr1, int[] arr2) {
		int[] output= new int[arr1.length];
		for(int index=0;index<arr1.length;index++) {
			output[index] = arr1[index] + arr2[index];
		}
		System.out.println(" index to index sum of 2 arrays  by sorting is ");
	     Arrays.sort(output);
	     System.out.println(Arrays.toString(output));
	}
	
	
	
	public static void main(String[] args) {
		int[] arr1 = {23, 34, 46, 67, 87};
		int[] arr2= {65, 43, 78, 45, 90};
		MaxNumberArray arr =new MaxNumberArray();
		arr.getMaxNumArray(arr1, arr2);
		arr.getMinNumArray(arr1, arr2);
		arr.getUnionOfArray(arr1, arr2);
		arr.getIndexSumAndSort(arr1, arr2);
		
	}
}
