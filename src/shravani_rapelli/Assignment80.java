package shravani_rapelli;

import java.util.Scanner;

public class Assignment80 {
	
	static int findMin(int[] arr) {
		int min =arr[0];
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	static int findMax(int[] arr) {
		int max =arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int count =0;
		System.out.println("Enter total numbers : ");
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		int arr[] = new int[count];
		for(int i=0; i<count; i++) {
			sc = new Scanner(System.in);
			System.out.println("Enter Number");
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Minimum Number = "+findMin(arr));
		System.out.println("Maximum Number = "+findMax(arr));
	}

}
