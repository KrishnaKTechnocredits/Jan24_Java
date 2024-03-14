package akshada_marne;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntOperationsUsingScannerClass {

	int max=0;
	
	void calculateMax(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
		}
		System.out.println("From "+ Arrays.toString(arr)+" "+ max+ " is the maximum number");
	}
	
	void calculateMin(int[] arr) {
		int min=max;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
		}
		System.out.println("From "+ Arrays.toString(arr)+" "+ min+ " is the minimum number");	}
	
	

	void getInput() {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is the length of Array?");
		int length=scanner.nextInt();
		int[] arr= new int[length];
	
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter input value of array");
		arr[i]=scanner.nextInt();
		}
		
		scanner.close();
		calculateMax(arr);
		calculateMin(arr);
		
	}

	public static void main(String args[]) {
		ArrayIntOperationsUsingScannerClass arrayIntOperationsUsingScannerClass = new ArrayIntOperationsUsingScannerClass();
		arrayIntOperationsUsingScannerClass.getInput();
	}
}
