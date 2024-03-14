/*
 * Assignment - 77 : 9th March'2024
Program 1: Find out first missing number from 1 to 10.
 
int[] x = {2,4,1,5,6,9,8,10};
output : 3

Program 2 : Find out last missing number from 1 to 10.
 
int[] x = {2,4,1,5,6,9,8,10};
output : 7

Program 3 : Find out all missing number from 1 to 10.
 
int[] x = {2,4,1,5,6,9,8,10};
output : 3
         7 
 */

package puja_poreddiwar;

public class Assignmt77MissingNo {

	void getFirstMissingNo(int[] arr) {

		for (int num = 1; num <= 10; num++) {
			boolean flag = false;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == num) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("First missing number is :  " + num);
				break;
			}
		}
	}

	void getLastMissingNo(int[] arr) {

		for (int num = 10; num >= 1; num--) {
			boolean flag = false;
			for (int i = arr.length - 1; i >= 0; i--) {

				if (arr[i] == num) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("Last missing number is : " + num);
				break;
			}
		}
	}

	void getAllMissingNo(int[] arr) {
		System.out.println("All Missing numbers are: ");
		for (int num = 1; num <= 10; num++) {
			boolean flag = false;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == num) {
					flag = true;
					break;
				}
			}
				if (flag == false)
				System.out.println(num);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 1, 5, 6, 9, 8, 10 };
		Assignmt77MissingNo missingNo = new Assignmt77MissingNo();
		missingNo.getFirstMissingNo(arr);
		missingNo.getLastMissingNo(arr);
		missingNo.getAllMissingNo(arr);
	}

}
