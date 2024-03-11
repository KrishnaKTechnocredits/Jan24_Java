package rohini_deshmane.array_programs;

import java.util.Arrays;

/*
 * Assignment - 77 : 9th March'2024
Program 1: Find out first missing number from 1 to 10.
 
int[] x = {2,4,1,5,6,9,8,10};
1,2,4,5,6,7,8,9,10
output : 3
 */
public class MissingNumberFromArray {

	boolean isNumberPresent(int[] arr, int num) {
		boolean isPresent = false;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				isPresent=true;
			}
		}
		return isPresent;
	}
	
	void findMissingNumber(int[] arr) {
		boolean isPresent = true;
		int missingNumber=0;
		for(int i=0; i<arr.length; i++) {
			isPresent = isNumberPresent(arr, i+1);
			if(isPresent==false) {
				missingNumber =i+1;
				break;
			}
		}
		System.out.println(missingNumber);
	}
	
	public static void main(String[] args) {
		int[] x = {2,4,1,5,6,9,8,10};
		MissingNumberFromArray firstMissingNumber = new MissingNumberFromArray();
		firstMissingNumber.findMissingNumber(x);
	}
}
