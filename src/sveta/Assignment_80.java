/*Assignment - 80 : 10th March'2024

Print maximum and minimum value from user defined array.
 
NOTE : use Scanner class.

input : 
Enter total numbers
5
Enter num : 10
Enter num : 2
Enter num : 1
Enter num : 100
Enter num : 98

output : From array [10, 2, 1, 100, 98], maximum number is 100 and minimum number is 1*/
package sveta;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_80 {

	void getMinNo(int[] arr) {
		int temp=0;
		for(int i =0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1]) {
				temp=arr[i];
			}
		}
		System.out.println("Minimum No -> "+temp);
	}
	
	void getMaxNo(int arr[]) {
		int temp=0;
		for(int i =0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				temp=arr[i];
			}
		}
		System.out.println("Maximum No -> "+temp);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The total no :");
		int size= scanner.nextInt();
		int input[]= new int[size];
		for(int i=0;i<input.length;i++) {
			System.out.println("Enter No.: ");
			input[i]=scanner.nextInt();
		}
		System.out.println(Arrays.toString(input));
		Assignment_80 ass_80 = new Assignment_80();
		ass_80.getMinNo(input);
		ass_80.getMaxNo(input);
				

	}

}
