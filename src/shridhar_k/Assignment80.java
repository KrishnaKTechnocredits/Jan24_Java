package shridhar_k;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment80 {
	
	void printMaxAndMinNumFromArr(int[] arr) {
		int maxNum = arr[0];
		int minNum = arr[0];
		for(int i =1;i<arr.length;i++) {
			if(maxNum < arr[i]) {
				maxNum = arr[i];
			}
			if(minNum > arr[i]) {
				minNum = arr[i];
			}
		}
		System.out.println("max num is " + maxNum);
		System.out.println("min num is " + minNum);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of input : ");
		int length = sc.nextInt();
		int[] inpArr = new int[length];
		for(int i=0;i<inpArr.length;i++) {
			System.out.println("Enter num : ");
			inpArr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(inpArr));
		sc.close();
		Assignment80 ac80 = new Assignment80();
		ac80.printMaxAndMinNumFromArr(inpArr);
		//sc.close();
	}
}
