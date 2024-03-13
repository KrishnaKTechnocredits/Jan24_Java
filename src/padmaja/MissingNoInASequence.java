/*Assignment - 77 : 9th March'2024
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

package padmaja;

public class MissingNoInASequence {

	void findFirstMissingNo(int[] arr) {
		for (int num = 1; num <= 10; num++) {
			boolean flag = false;
			for (int index = 0; index < arr.length; index++) {
				if (arr[index] == num) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("First missing No is " + num);
				break;
			}
		}
	}

	void findLastMissingNo(int[] arr) {
		for (int num = 10; num >= 1; num--) {
			boolean flag = false;
			for (int index = arr.length - 1; index >= 0; index--) {
				if (arr[index] == num) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("Last missing No is " + num);
				break;
			}
		}
	}

	void findAllMissingNo(int[] arr) {
		for (int num = 1; num <= 10; num++) {
			boolean flag = false;
			for (int index = 0; index < arr.length; index++) {
				if (arr[index] == num) {
					flag = true;
					break;
				}
			}
			if (flag == false)
				System.out.print(num + " ");
		}
	}

	public static void main(String[] args) {
		int[] input = { 2, 4, 1, 5, 6, 9, 8, 10 };
		MissingNoInASequence missingNo = new MissingNoInASequence();
		missingNo.findFirstMissingNo(input);
		missingNo.findLastMissingNo(input);
		System.out.print("All missing Nos are ");
		missingNo.findAllMissingNo(input);
	}
}
