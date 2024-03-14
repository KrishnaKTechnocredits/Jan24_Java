package rohini_deshmane.programming_test;
/*
Write a Program to divide one array into same size of two arrays and add elements of both the arrays
Original Array = [1, 10, 20, 12, 15, 6]
New Array 1 = [1, 10, 20]
New Array 2 = [12, 15, 6]

Sum Of two Array elements = [13, 25, 26]
 */
import java.util.Arrays;
import java.util.Scanner;

public class ProgrammingTest4 {

	void additionOfElements(int[] arr1, int[] arr2) {
		int[] sumArr = new int[arr1.length];
		for(int i=0; i< arr1.length; i++) {
			sumArr[i]=arr1[i]+arr2[i];
		}
		System.out.println("Sum Of two Array elements = "+Arrays.toString(sumArr));
	}
	
	void divideArray(int[] arr){
		int size;
		if(arr.length %2 ==0)
			size = arr.length/2;
		else
			size = (arr.length/2)+1;
		
		int[] newArr1 = new int[size];
		int[] newArr2 = new int[size];
		int count=0;
		
		for(int i=0; i<size; i++) {
			newArr1[i]=arr[count];
			count++;
		}
		
		for(int i=0; i<size; i++) {
			if(arr.length <= count) {
				newArr2[i] =0;
			} else
				newArr2[i]=arr[count];
			
			count++;
		}
		
		System.out.println("Original Array = "+Arrays.toString(arr));
		System.out.println("New Array 1 = "+Arrays.toString(newArr1));
		System.out.println("New Array 2 = "+Arrays.toString(newArr2));
		System.out.println();
		additionOfElements(newArr1,newArr2);
	}
	
	public static void main(String[] args) {
		int[] num; //{1,10,20,12,15,6};
		int arrSize;
		System.out.println("Enter required Size of Array");
		Scanner scan = new Scanner(System.in);
		arrSize = scan.nextInt();
		num = new int [arrSize];
		
		System.out.println("Enter Array elements");
		for(int i=0; i< arrSize; i++) {
			scan = new Scanner(System.in);
			num[i] = scan.nextInt();
		}
		
		ProgrammingTest4 test = new ProgrammingTest4();
		test.divideArray(num);
	}
}
