package ashwini_b;

import java.util.Arrays;

/*
 Divide array into two equal length and print them, return the array having sum of both equally divided array.
int[]num = {1,10, 20, 12, 15, 6}
hint :
num1 = {1,10,20}
num2 = {12,15,6}
output = {13, 25, 26}
 */
public class Programming_Test_4 {

	void sumOfTwoArray(int arr[]) {
		int num1Array[] = new int[arr.length / 2];
		int num2Array[] = new int[arr.length / 2];
		int sumArray[] = new int[arr.length / 2];
		for (int index = 0; index < arr.length / 2; index++) {
			num1Array[index] = arr[index];
		}
		int i = 0;
		for (int index = arr.length / 2; index < arr.length; index++) {
			num2Array[i] = arr[index];
			i++;
		}
		System.out.println("num1 = " + Arrays.toString(num1Array));
		System.out.println("num2 = " + Arrays.toString(num2Array));
		for (int j = 0; j < arr.length / 2; j++) {
			sumArray[j] = num1Array[j] + num2Array[j];
		}
		System.out.println("output = " + Arrays.toString(sumArray));
	}

	public static void main(String[] args) {
		int[] numarr = { 1, 10, 20, 12, 15, 6 };
		Programming_Test_4 programming_Test_4 = new Programming_Test_4();
		programming_Test_4.sumOfTwoArray(numarr);
	}
}
