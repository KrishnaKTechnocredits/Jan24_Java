package akshay_gaikwad;

import java.util.Scanner;

public class MaxAndMinUserArray {
	
	void MaxMinNumber(int[] arr){
		int maxNum = arr[0];
		int minNum = arr[0];
		for(int num: arr) {
			if(maxNum < num) {
				maxNum = num;
			}
		}
		for(int num: arr) {	
			if(minNum > num) {
				minNum = num;
			}
		}
		System.out.println("Maximum number is : " + maxNum);
		System.out.println("Minimum number is : " + minNum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers are in array");
		int len = sc.nextInt();
		int[] arr = new int[len-1];
		System.out.println("Write numbers");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = sc.nextInt();
		}
		new MaxAndMinUserArray().MaxMinNumber(arr);
		sc.close();
	}
}
