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
         7 */
package madhura_kulkarni;

public class Assignment77 {

	void findFirstMissingNumber(int[] arr) {
		for (int num = 1; num <= 10; num++) {
			boolean flag = false;
			for (int i = 0; i < arr.length; i++) {
				if (num == arr[i]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("First missing number is : " + num);
				break;
			}

		}
	}

	void findLastMissingNumber(int[] arr) {
		int temp = 0;
		for (int num = 1; num <= 10; num++) {
			boolean flag = false;
			for (int i = 0; i < arr.length; i++) {
				if (num == arr[i]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				temp = num;
			}
		}
		if (temp == 0)
			System.out.println("All numbers are present in the array");
		else
			System.out.println("Last missing number from array is :" + temp);

	}

	void findAllMissingNumber(int[] arr) {
		for (int num = 1; num <= 10; num++) {
			boolean flag = false;
			for (int i = 0; i < arr.length; i++) {
				if (num == arr[i]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println(num + " is missing in the array.");
			}
		}
	}

	public static void main(String[] args) {
		int[] x = { 2, 4, 1, 5, 6, 9, 8, 10 };
		Assignment77 ass = new Assignment77();
		System.out.println("Printing the first missing number in the array : ");
		ass.findFirstMissingNumber(x);
		System.out.println("Printing the last missing number in the array : ");
		ass.findLastMissingNumber(x);
		System.out.println("Printing all the missing numbers in the array : ");
		ass.findAllMissingNumber(x);
	}

}
