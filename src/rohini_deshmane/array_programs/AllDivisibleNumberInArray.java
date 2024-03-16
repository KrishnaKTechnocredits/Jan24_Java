package rohini_deshmane.array_programs;

import java.util.Arrays;
import java.util.Scanner;
/*
 Programing test - 5
find array elements which is divisible by 5
Original Array = [23, 55, 10, 27, 90]
Array Elements Divisible by 5 = [55, 10, 90]
 */

public class AllDivisibleNumberInArray {
	
	int getDivisibleByFiveCount(int[] arr) {
		int count=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%5 ==0) {
				count++;
			}
		}
		return count;
	}
	
	int[] getNumber(int[] arr) {
		int arrSize = getDivisibleByFiveCount(arr);
		int[] newArr = new int[arrSize];
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%5==0) {
				newArr[count]=arr[i];
				count++;
			}
		}

		return newArr;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Array elements");
		for(int i=0; i< size; i++) {
			sc = new Scanner(System.in);
			int number = sc.nextInt();
			arr[i]=number;
		}
		sc.close();
		System.out.println("Original Array = "+Arrays.toString(arr));
		AllDivisibleNumberInArray numObj = new AllDivisibleNumberInArray();
		int arrSize = numObj.getDivisibleByFiveCount(arr);
		int[] divisibleArr = new int[arrSize];
		divisibleArr = numObj.getNumber(arr);
		System.out.println("Array Elements Divisible by 5 = "+Arrays.toString(divisibleArr));
	}

}
