package technocredits.scannerdemo;

import java.util.Arrays;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("Enter how many names you want to consider");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		String[] arr = new String[length];
		
		for(int index=0;index<arr.length;index++) {
			System.out.println("Enter name : ");
			arr[index] = sc.next();
		}
		System.out.println("==============");
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
