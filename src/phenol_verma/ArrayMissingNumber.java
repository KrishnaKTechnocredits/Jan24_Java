/*Assignment - 77 : 9th March'2024
PhenolV_Assignment_80
Program 1: Find out first missing number from 1 to 10.
 
int[] x = {2,4,1,5,6,9,8,10};
output : 3

Program 2 : Find out last missing number from 1 to 10.
 
int[] x = {2,4,1,5,6,9,8,10};
output : 7

Program 3 : Find out all missing number from 1 to 10.
 
int[] x = {2,4,1,5,6,9,8,10};
output : 3
         7 */

package phenol_verma;

import java.util.Arrays;

public class ArrayMissingNumber {

//	Program 1: Find out first missing number from 1 to 10.
	void Program1(int[] arr) {
		for (int index = 1; index <= 10; index++) {

			boolean flag = false;

			for (int chkMissingNum = 0; chkMissingNum < arr.length; chkMissingNum++) {
				if (index == arr[chkMissingNum]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println(index);
				break;
			}
		}
	}

//	Program 2 : Find out last missing number from 1 to 10.
	void Program2(int[] arr) {

		int lastMissingNum = 0;

		for (int index = 1; index <= 10; index++) {

			boolean flag = false;

			for (int chkMissingNum = 0; chkMissingNum < arr.length; chkMissingNum++) {
				if (index == arr[chkMissingNum]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				lastMissingNum = index;
			}
		}
		System.out.println(lastMissingNum);
	}

//	Program 3 : Find out all missing number from 1 to 10.
	void Program3(int[] arr) {
		for (int index = 1; index <= 10; index++) {

			boolean flag = false;

			for (int chkMissingNum = 0; chkMissingNum < arr.length; chkMissingNum++) {
				if (index == arr[chkMissingNum]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.print(index + " ");
			}
		}
	}

	public static void main(String[] args) {
		ArrayMissingNumber arrayMissingNumber = new ArrayMissingNumber();
		int[] x = { 2, 4, 1, 5, 6, 9, 8, 10 };
		System.out.println("Input Array - " + Arrays.toString(x));

		System.out.print("First missing number from 1 to 10 - ");
		arrayMissingNumber.Program1(x);

		System.out.print("Last missing number from 1 to 10 - ");
		arrayMissingNumber.Program2(x);

		System.out.print("All missing number from 1 to 10 - ");
		arrayMissingNumber.Program3(x);
	}
}
