
/*
 * Push all the zeros at the end of an array.
int[] arr = {10,-12,6,-3,0,0,-33,44,0,4};
output : {10,-12,6,-3,-33,44,4,0,0,0};
 */
package shridhar_k;

import java.util.Arrays;

public class Assignment54 {
	
	private int[] getRearrangedArray(int[] arr) {
		int[] rearranged = new int[arr.length];
		int countFromBack = arr.length - 1;
		int countFromFront = 0;
		for (int i=0; i< arr.length ; i++) {
			if(arr[i]==0) {
				rearranged[countFromBack] = 0;
				countFromBack--;
			}else {
				rearranged[countFromFront] = arr[i];
				countFromFront++;
			}
		}
		return rearranged;
	}
	
	void printOutput(int[] arr) {
		int[] outPutArr = getRearrangedArray(arr);
		String printOutput = Arrays.toString(outPutArr).replace('[', '{').replace(']', '}');
		System.out.println(printOutput);
	}
	
	public static void main(String[] args) {
		int[] arr = {10,-12,6,-3,0,0,-33,44,0,4};
		Assignment54 assignment54 = new Assignment54();
		assignment54.printOutput(arr);
	}
}
