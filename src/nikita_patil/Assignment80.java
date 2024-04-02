package nikita_patil;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment80 {
	void getMinNo(int[] arr) {
		int temp=0;
		for(int i =0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1]) {
				temp=arr[i];
			}
		}
		System.out.println("Minimum No is: "+temp);
	}
	void getMaxNo(int arr[]) {
		int temp=0;
		for(int i =0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				temp=arr[i];
			}
		}
		System.out.println("Maximum No is: "+temp);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The total no :");
		int size= scanner.nextInt();
		int input[]= new int[size];
		for(int i=0;i<input.length;i++) {
			System.out.println("Enter No.: ");
			input[i]=scanner.nextInt();
		}
		System.out.println(Arrays.toString(input));
		Assignment80 a = new Assignment80();
		a.getMinNo(input);
		a.getMaxNo(input);
				

	}

}

	
